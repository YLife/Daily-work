package com.yl.after;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {
	
	private Logger logger = Logger.getLogger(AfterAdvice.class); 
	
	@Override
	public void afterReturning(Object result, Method method, Object[] params,
			Object target) throws Throwable {
		logger.info(target.getClass().getName() + "���" + method.getName() + "�����ã�" + "�����б�" + params + "�����:" + result);
		for (Object object : params) {
			logger.warn(object);
		}
	}

}
