package com.yl.action;

import com.yl.entity.User;
/**
 * ҵ���߼�������
 * @author Mr.Yang
 *
 */
public class UserAction {
	private String uname;
	private User user = new User();
	public String execute(){
		System.out.println("�������󡣡�����" + user.getUname() + ":" +user.getPwd());
		return "success";
	}
	
	public String doLogin(){
		System.out.println("���������¼��������" + user.getUname() + ":" +user.getPwd());
		return "success";
	}
	
	public String doList(){
		System.out.println("��������list��������" + user.getUname() + ":" +user.getPwd());
		return "list";
	}
	
	public String doRegist(){
		System.out.println("��������ע�ᡣ������" + user.getUname() + ":" +user.getPwd());
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
