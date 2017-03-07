package com.yl.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yl.entity.User;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User user;
	
	public String doLogin() {
		System.out.println("ok.......");
		if (user.getUserName().equals("hello") && user.getPwd().equals("hello")) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", user);
			System.out.println(user.getUserName());
			return SUCCESS;
		}
		return LOGIN;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
