package com.yl.pojo;

import java.util.Date;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empno;
	private Dept dept;
	private String ename;
	private String job;
	private Double sal;
	private Double comm;
	private Integer mgr;
	private Date hiredate;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(Dept dept, String ename, String job, Double sal, Double comm,
			Integer mgr, Date hiredate) {
		this.dept = dept;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.mgr = mgr;
		this.hiredate = hiredate;
	}

	// Property accessors

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getMgr() {
		return this.mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

}