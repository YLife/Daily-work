package com.yl.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.pojo.Emp;
import com.yl.vo.EmpVo;

public class EmpAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private EmpBiz biz = new EmpBizImpl();
	private Emp emp;
	private EmpVo vo;
	private List<Emp> list = new ArrayList<Emp>();
	private Integer currentPage;
	private Integer pageSize;
	private int totalPage;
	
	public String queryList(){
		if (vo != null) {
			System.out.println(vo.getBegin());
		}
		currentPage = currentPage == null ? 1 : currentPage;
		pageSize = pageSize == null ? 5 : pageSize;
		list = biz.queryList(currentPage, pageSize, vo);
		totalPage = biz.getTotalPage(pageSize, vo);
		return "list";
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}


	public List<Emp> getList() {
		return list;
	}


	public void setList(List<Emp> list) {
		this.list = list;
	}


	public Integer getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	public Integer getPageSize() {
		return pageSize;
	}


	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public EmpVo getVo() {
		return vo;
	}


	public void setVo(EmpVo vo) {
		this.vo = vo;
	}
}
