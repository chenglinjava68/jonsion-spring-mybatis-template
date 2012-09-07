package com.jonsion.web.controller;



import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonsion.domain.Account;
import com.jonsion.service.IAccountService;

@Controller 
@RequestMapping("/accounts") 
public class AccountController {
	protected static final Logger logger = LoggerFactory.getLogger(AccountController.class); 
	    
    @Autowired
	private IAccountService accountService;
	
	/** 
	* 转向用户添加页面 
	* @return 返回转向信息 
	*/ 
	@RequestMapping("/addUser") 
	public String addUser() { 
	return "addUser"; 
	} 
	    
	/** 
	* 添加用户 
	* @param acc实体 
	* @return 返回转向信息 
	*/ 
	@RequestMapping("/add") 
	public String regist(Account acc) { 
	try { 
		accountService.regist(acc); 
	logger.debug("add success");
	} catch (Exception e) { 
	e.printStackTrace(); 
	logger.error("增加时发生异常：",e); 
	} 
	return "redirect:/accounts/queryPage.do"; 
	} 

//	/** 
//	* 查询用户 
//	* @param acc实体 
//	* @return 返回转向信息 
//	*/ 
//	@RequestMapping("/queryPage") 
//	public String queryPage(Account acc,Model model) { 
//	try { 
//	int count =accountMapper.getCount(acc); 
//	Pagenation pagenation=new    Pagenation(PAGE_SIZE,acc.getPageNum(),count); 
//	acc.setStartRow(pagenation.getStartRow()); 
//	acc.setPageSize(PAGE_SIZE); 
//	List<Account> list=accountMapper.getAllList(acc); 
//	pagenation.setList(list); 
//	model.addAttribute("pagenation",pagenation); 
//	} catch (Exception e) { 
//	e.printStackTrace(); 
//	//logger.error("query时发生异常：",e); 
//	} 
//	return "userList"; 
//	} 
}
