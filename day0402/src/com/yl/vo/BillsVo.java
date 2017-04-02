package com.yl.vo;

import java.util.Date;

public class BillsVo {
	private Integer type;
	private Date begin;
	private Date end;
	
	public BillsVo() {
		super();
	}

	public BillsVo(Integer type, Date begin, Date end) {
		super();
		this.type = type;
		this.begin = begin;
		this.end = end;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
