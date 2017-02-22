package com.yl.entity;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private Integer deptno;
	private String dname;
	private Set<Emp> empSet = new HashSet<Emp>();
	public Dept() {
		super();
	}
	public Dept(Integer deptno, String dname, Set<Emp> empSet) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.empSet = empSet;
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
	public Set<Emp> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<Emp> empSet) {
		this.empSet = empSet;
	}

}
