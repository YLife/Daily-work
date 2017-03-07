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
		System.out.println("��ִ��˭�أ�??????????????");
		return null;
	}
	
	@Override
	public void validate() {
		if (user.getUserName() == null || "".equals(user.getUserName())) {
			System.out.println("�û���Ϊ�ա�������������������");
			super.addFieldError("userName", "�û�������Ϊ��");
		}
		if (user.getPwd() == null || "".equals(user.getPwd())) {
			System.out.println("���벻��Ϊ�ա�����������������");
			super.addFieldError("pwd", "���벻��Ϊ��");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
