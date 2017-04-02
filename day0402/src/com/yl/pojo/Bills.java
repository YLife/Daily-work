package com.yl.pojo;

import java.util.Date;

/**
 * Bills entity. @author MyEclipse Persistence Tools
 */

public class Bills implements java.io.Serializable {

	// Fields

	private Integer id;
	private BillType billType;
	private String title;
	private Date billTime;
	private Double price;
	private String explain;

	// Constructors

	/** default constructor */
	public Bills() {
	}

	/** full constructor */
	public Bills(BillType billType, String title, Date billTime, Double price,
			String explain) {
		this.billType = billType;
		this.title = title;
		this.billTime = billTime;
		this.price = price;
		this.explain = explain;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BillType getBillType() {
		return this.billType;
	}

	public void setBillType(BillType billType) {
		this.billType = billType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBillTime() {
		return this.billTime;
	}

	public void setBillTime(Date billTime) {
		this.billTime = billTime;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getExplain() {
		return this.explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

}