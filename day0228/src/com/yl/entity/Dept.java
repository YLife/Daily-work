package com.yl.entity;

import java.util.ArrayList;
import java.util.List;

public class Dept {
	private Integer deptno;
	private String dname;
	private List<Emp> list = new ArrayList<Emp>();
	
	public Dept() {
		super();
	}

	public Dept(Integer deptno, String dname, List<Emp> list) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.list = list;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Emp> getList() {
		return list;
	}

	public void setList(List<Emp> list) {
		this.list = list;
	}
}
