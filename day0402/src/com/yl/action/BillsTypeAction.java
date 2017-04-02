package com.yl.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.BillTypeBiz;
import com.yl.pojo.BillType;

public class BillsTypeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private BillTypeBiz biz;
	private List<BillType> list = new ArrayList<BillType>();
	
	public String queryTypes(){
		list = biz.findTypes();
		return "queryTypes";
	}

	public List<BillType> getList() {
		return list;
	}

	public void setList(List<BillType> list) {
		this.list = list;
	}

	public void setBiz(BillTypeBiz biz) {
		this.biz = biz;
	}
	
}
