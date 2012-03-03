package com.jonsion.dao;

import com.jonsion.domain.Account;
import com.jonsion.exception.CustomException;

public interface IAccountDao {
	public void delete(Account ac) throws CustomException;
}
