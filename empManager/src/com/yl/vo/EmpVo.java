package com.yl.vo;

import java.util.Date;
/**
 * 值对象，封装条件信息
 * @author Administrator
 *
 */
public class EmpVo {
	private String ename;
	private int deptno;
	private Date begin;
	private Date end;
	
	public EmpVo() {
		super();
	}

	public EmpVo(String ename, int deptno, Date begin, Date end) {
		super();
		this.ename = ename;
		this.deptno = deptno;
		this.begin = begin;
		this.end = end;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	
}
