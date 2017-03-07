package com.yl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.entity.User;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User user;
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute..........");
		return null;
	}
	
	public String login(){
		System.out.println("该执行谁呢？??????????????");
		return null;
	}
	
	@Override
	public void validate() {
		if (user.getUserName() == null || "".equals(user.getUserName())) {
			System.out.println("用户名为空。。。。。。。。。。");
			super.addFieldError("userName", "用户名不能为空");
		}
		if (user.getPwd() == null || "".equals(user.getPwd())) {
			System.out.println("密码不能为空。。。。。。。。。");
			super.addFieldError("pwd", "密码不能为空");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
