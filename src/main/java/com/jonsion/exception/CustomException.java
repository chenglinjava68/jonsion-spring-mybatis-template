package com.jonsion.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	
	public CustomException()  {}                //用来创建无参数对象
    
	public CustomException(String message) {        //用来创建指定参数对象
        super(message);                             //调用超类构造器
    }
	
	public CustomException(String message,Exception e) {        //用来创建指定参数对象
        super(message,e);                             //调用超类构造器
    }
}
