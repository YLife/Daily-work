package com.yl.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.yl.entity.User;

public class MyInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		User user = (User) session.get("user");
		if (user == null) {
			System.out.println("该用户不存在。。。。。。。。。。。");
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

}
