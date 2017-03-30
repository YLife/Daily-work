package com.yl.pojo;

import java.util.Date;

public class Emp {
	private Integer empno;
	private String ename;
	private String job;
	private Double sal;
	private Double comm;
	private Integer mgr;
	private Date hireate;
	private Integer deptno;
	
	public Emp() {
		super();
	}

	public Emp(Integer empno, String ename, String job, Double sal,
			Double comm, Integer mgr, Date hireate, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.mgr = mgr;
		this.hireate = hireate;
		this.deptno = deptno;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHireate() {
		return hireate;
	}

	public void setHireate(Date hireate) {
		this.hireate = hireate;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
}
