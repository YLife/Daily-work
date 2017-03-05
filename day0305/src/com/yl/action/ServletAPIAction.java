package com.yl.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class ServletAPIAction {
	
	public String execute(){
		ActionContext context = ActionContext.getContext();
		@SuppressWarnings("unchecked")
		Map<String, Object> resquest = (Map<String, Object>) context.get("request");
		resquest.put("name", "hello");
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("name", "hello world!");
		return "index";
	}
}
