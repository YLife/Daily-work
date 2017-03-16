package com.yl.around;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class AroundAdvice implements MethodInterceptor {
	
	private Logger logger = Logger.getLogger(AroundAdvice.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info(invocation.getThis().getClass().getName() + "���" + invocation.getMethod().getName() + "����������");
		Object result = invocation.proceed();//����Ŀ����󷽷�
		logger.info(invocation.getThis().getClass().getName() + "���" + invocation.getMethod().getName() + "������ִ��" + "����ǣ�" + result);
		return result;
	}

}
