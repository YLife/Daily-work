package com.yl.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * BillType entity. @author MyEclipse Persistence Tools
 */

public class BillType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set billses = new HashSet(0);

	// Constructors

	/** default constructor */
	public BillType() {
	}

	/** full constructor */
	public BillType(String name, Set billses) {
		this.name = name;
		this.billses = billses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBillses() {
		return this.billses;
	}

	public void setBillses(Set billses) {
		this.billses = billses;
	}

}