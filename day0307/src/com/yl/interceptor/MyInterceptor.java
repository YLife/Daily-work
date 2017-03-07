package com.yl.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("自定义拦截器销毁了。。。。。。");

	}

	@Override
	public void init() {
		System.out.println("自定义拦截器实例化了。。。。。。。。。。");

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("自定义拦截器拦截了。。。。。。。。。。。。。。");
		return arg0.invoke();
	}

}
