package com.yl.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Ognl {
	private String str;
	private List<String> mList = new ArrayList<String>();
	public String execute(){
		str = "hello";
		ActionContext context = ActionContext.getContext();
		Map<String, Object> map = (Map<String, Object>) ActionContext.getContext().get("request");
		map.put("str", "hello request");
		context.put("str", "hello context");
		mList.add("hello1");
		mList.add("hello2");
		mList.add("hello3");
		mList.add("hello4");
		mList.add("hello5");
		return "success";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
