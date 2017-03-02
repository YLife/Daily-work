package com.yl.entity;

public class EmpJob {
	private Integer jobId;
	private String jobName;
	
	public EmpJob() {
		super();
	}

	public EmpJob(Integer jobId, String jobName) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
