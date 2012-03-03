package com.jonsion.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonsion.dao.IAccountDao;
import com.jonsion.dao.mapper.AccountMapper;
import com.jonsion.domain.Account;
import com.jonsion.exception.CustomException;
import com.jonsion.service.IAccountService;

@Service(value="accountService")
@Transactional
public class AccountServiceImpl implements IAccountService {
	@Inject 
    private AccountMapper accountMapper; 
	
	@Autowired
	private IAccountDao accountDao;
	
	@Transactional
	public Account regist(Account ac)  throws CustomException{
		// TODO Auto-generated method stub
		try {
			List<Account> ls=accountMapper.getAccountByUserName(ac);
			
			if(ls==null || ls.size()==0){
				
				accountMapper.add(ac);
				
			}else{
				
				throw  new CustomException("もう存在した");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean login(Account ac)  throws CustomException{
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			List<Account> ls=accountMapper.getAccountByUserName(ac);
			
			if(ls==null || ls.size()==0){
				
				throw  new CustomException("存在しない");
				
			}else{
				
				for(Account tac : ls){
					if(ac.getUserPassword().equals(tac.getUserPassword())){
						flag = true;
						break;
					}
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw  new CustomException("ユーザを取る時にエラーが発生した",e);
		}
		
		return flag;
	}
	
	
	public void deleteAccount(Account ac)  throws CustomException{
		
		accountDao.delete(ac);
		
	}

}
