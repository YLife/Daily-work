package com.yl.entity;

import java.util.HashSet;
import java.util.Set;

public class Project {
	private Integer prono;
	private String pname;
	private Set<Employee> empSet = new HashSet<Employee>();
	
	public Project() {
		super();
	}

	public Project(Integer prono, String pname, Set<Employee> empSet) {
		super();
		this.prono = prono;
		this.pname = pname;
		this.empSet = empSet;
	}

	public Integer getProno() {
		return prono;
	}

	public void setProno(Integer prono) {
		this.prono = prono;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}	
}
