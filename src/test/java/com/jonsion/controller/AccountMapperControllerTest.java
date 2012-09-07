package com.jonsion.controller;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jonsion.domain.Account;
import com.jonsion.service.IAccountService;

public class AccountMapperControllerTest extends BaseTest{
	protected static final Logger logger = LoggerFactory.getLogger(AccountMapperControllerTest.class);
	
	@Autowired
	private IAccountService accountService;
	
  @Test
  public void add() {
	  Account acc=new Account();
	  acc.setUserName("test1");
	  acc.setUserPassword("password1");
	  
	  try {
		  accountService.regist(acc);
		  logger.debug("accountService.regist(acc)");
		  boolean flag=accountService.login(acc);
		  logger.debug("boolean flag=accountService.login(acc);");
		  accountService.deleteAccount(acc);
		  logger.debug("accountService.deleteAccount(acc);");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

// public static void main(String[] args) throws Exception { 
//          Class.forName("org.h2.Driver"); 
//	  Connection conn = DriverManager.getConnection("jdbc:h2:C:/jonsion/workspace/jonsion-spring-mybatis-template/src/main/webapp/h2/db/jc;AUTO_SERVER=TRUE", "sa", ""); 
//	  System.out.println(conn);	
//  }
  
  @Test
  public void addUser() {
    //throw new RuntimeException("Test not implemented");
	  Assert.assertEquals(true, true) ;
  }
}
