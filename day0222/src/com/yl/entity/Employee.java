package com.yl.entity;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private Integer empno;
	private String ename;
	private Set<Project> proSet = new HashSet<Project>();
	public Employee() {
		super();
	}
	public Employee(Integer empno, String ename, Set<Project> proSet) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.proSet = proSet;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Set<Project> getProSet() {
		return proSet;
	}
	public void setProSet(Set<Project> proSet) {
		this.proSet = proSet;
	}
	
}
