package com.jonsion.controller;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonsion.dao.mapper.AccountMapper;
import com.jonsion.domain.Account;

@Controller 
@RequestMapping("/accounts") 
public class AccountMapperController {
	//protected static final Logger logger = Logger.getLogger(AccountMapperController.class); 
	protected static final Integer PAGE_SIZE = 10; 
	    @Inject 
	    private AccountMapper accountMapper; 
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
	public String add(Account acc) { 
	try { 
	accountMapper.add(acc); 
	} catch (Exception e) { 
	e.printStackTrace(); 
	//logger.error("增加时发生异常：",e); 
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
