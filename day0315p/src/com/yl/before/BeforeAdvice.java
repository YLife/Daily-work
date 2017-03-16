package com.yl.before;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {
	
	private Logger logger = Logger.getLogger(BeforeAdvice.class);
	
	@Override
	public void before(Method method, Object[] params, Object target)
			throws Throwable {
		logger.info(target.getClass().getName() + "类的" + method.getName() + "调用结束");
	}

}
