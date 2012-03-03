package com.jonsion.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jonsion.dao.IAccountDao;
import com.jonsion.domain.Account;
import com.jonsion.exception.CustomException;

@Repository(value="accountDao")
public class AccountDaoImpl implements IAccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void delete(Account ac) throws CustomException {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from acount where userName='"+ac.getUserName()+"'");
	}

}
