package com.yl.vo;

import java.util.Date;

/**
 * 封装条件信息
 * @author Mr.Yang
 *
 */
public class EmpVo {
	private String name;
	private int deptno;
	private Date begin;
	private Date end;
	public EmpVo() {
		super();
	}
	
	public EmpVo(String name, int deptno, Date begin, Date end) {
		super();
		this.name = name;
		this.deptno = deptno;
		this.begin = begin;
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
