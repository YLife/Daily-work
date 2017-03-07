package com.yl.action;

import com.yl.entity.User;

public class HelloAction {
	private User user ;
	
	public String execute(){
		System.out.println("hello.........");
		System.out.println(user.getUserName());
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
