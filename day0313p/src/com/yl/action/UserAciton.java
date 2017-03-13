package com.yl.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class UserAciton {
	
	private String uname;
	
	public String execute(){
		/*HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		System.out.println(uname);
		if (uname != null && !"".equals(uname)) {
			if (uname.equals("hello")) {
				try {
					response.getWriter().print("该昵称已被使用");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				try {
					response.getWriter().print("该昵称可以使用");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		uname = "hello world";
		return "success";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
}
