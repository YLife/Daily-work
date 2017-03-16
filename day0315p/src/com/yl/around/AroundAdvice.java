package com.yl.around;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class AroundAdvice implements MethodInterceptor {
	
	private Logger logger = Logger.getLogger(AroundAdvice.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info(invocation.getThis().getClass().getName() + "类的" + invocation.getMethod().getName() + "方法被调用");
		Object result = invocation.proceed();//调用目标对象方法
		logger.info(invocation.getThis().getClass().getName() + "类的" + invocation.getMethod().getName() + "方法被执行" + "结果是：" + result);
		return result;
	}

}
