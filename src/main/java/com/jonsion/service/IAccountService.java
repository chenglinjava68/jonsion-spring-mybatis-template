package com.jonsion.service;

import com.jonsion.domain.Account;
import com.jonsion.exception.CustomException;

public interface IAccountService {
	
	public Account regist(Account ac) throws CustomException;
	
	public boolean login(Account ac) throws CustomException;
	
	public void deleteAccount(Account ac)  throws CustomException;
}
