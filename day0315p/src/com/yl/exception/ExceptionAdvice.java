package com.yl.exception;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice {
	
	private Logger logger = Logger.getLogger(ExceptionAdvice.class);
	
	public void afterThrowing(Method method , Object[] params , Object target , Exception ex){
		logger.info(target.getClass().getName() + ":" + method.getName() + "±»µ÷ÓÃ");
	}
}
