package com.yl.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("�Զ��������������ˡ�����������");

	}

	@Override
	public void init() {
		System.out.println("�Զ���������ʵ�����ˡ�������������������");

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("�Զ��������������ˡ���������������������������");
		return arg0.invoke();
	}

}
