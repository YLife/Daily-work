package com.yl.entity;

import java.util.Date;

/**
 * 员工信息
 * @author Administrator
 *
 */
public class Emp {
	private int empNo;
	private String eName;
	private String job;
	private double sal;
	private double comm;
	private int mgr;
	private Date hireDate;
	private Dept dept;
	
	public Emp() {
		super();
	}

	public Emp(int empNo, String eName, String job, double sal, double comm,
			int mgr, Date hireDate, Dept dept) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.dept = dept;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
}
