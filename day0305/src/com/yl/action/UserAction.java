package com.yl.action;

import com.yl.entity.User;
/**
 * 业务逻辑控制器
 * @author Mr.Yang
 *
 */
public class UserAction {
	private String uname;
	private User user = new User();
	public String execute(){
		System.out.println("处理请求。。。。" + user.getUname() + ":" +user.getPwd());
		return "success";
	}
	
	public String doLogin(){
		System.out.println("处理请求登录。。。。" + user.getUname() + ":" +user.getPwd());
		return "success";
	}
	
	public String doList(){
		System.out.println("处理请求list。。。。" + user.getUname() + ":" +user.getPwd());
		return "list";
	}
	
	public String doRegist(){
		System.out.println("处理请求注册。。。。" + user.getUname() + ":" +user.getPwd());
		return "success";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
