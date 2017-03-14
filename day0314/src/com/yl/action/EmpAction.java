package com.yl.action;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.pojo.Emp;

public class EmpAction {
	
	private EmpBiz biz;
	private List<Emp> list;
	
	public String execute(){
		list = biz.queryEmps();
		return "success";
	}

	public List<Emp> getList() {
		return list;
	}

	public void setList(List<Emp> list) {
		this.list = list;
	}

	public EmpBiz getBiz() {
		return biz;
	}

	public void setBiz(EmpBiz biz) {
		this.biz = biz;
	}
	
}
