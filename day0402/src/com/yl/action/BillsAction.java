package com.yl.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.BillTypeBiz;
import com.yl.biz.BillsBiz;
import com.yl.pojo.BillType;
import com.yl.pojo.Bills;
import com.yl.vo.BillsVo;

public class BillsAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private BillsBiz biz;
	private BillTypeBiz tbiz;
	private Integer id;
	private Bills bills;
	private BillsVo vo;
	private List<Bills> list = new ArrayList<Bills>();
	private List<BillType> tlist = new ArrayList<BillType>();
	
	public String queryBills(){
		list = biz.findBills(vo);
		tlist = tbiz.findTypes();
		return "queryBills";
	}
	
	public String saveBills(){
		biz.saveBills(bills);
		return "saveBills";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bills getBills() {
		return bills;
	}

	public void setBills(Bills bills) {
		this.bills = bills;
	}

	public BillsVo getVo() {
		return vo;
	}

	public void setVo(BillsVo vo) {
		this.vo = vo;
	}

	public List<Bills> getList() {
		return list;
	}

	public void setList(List<Bills> list) {
		this.list = list;
	}

	public List<BillType> getTlist() {
		return tlist;
	}

	public void setTlist(List<BillType> tlist) {
		this.tlist = tlist;
	}

	public void setBiz(BillsBiz biz) {
		this.biz = biz;
	}

	public void setTbiz(BillTypeBiz tbiz) {
		this.tbiz = tbiz;
	}
	
}
