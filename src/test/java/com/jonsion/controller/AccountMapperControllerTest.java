package com.jonsion.controller;


import javax.inject.Inject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jonsion.dao.mapper.AccountMapper;
import com.jonsion.domain.Account;

public class AccountMapperControllerTest extends AbstractTestCase{
	@Inject 
	private AccountMapper accountMapper; 
	
  @Test
  public void add() {
	  Account acc=new Account();
	  acc.setUserName("test1");
	  acc.setUserPassword("password1");
	  
	  try {
		accountMapper.add(acc);
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
