package com.yl.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 封装关系信息
 * @author Mr.Yang
 *
 */
public class Relation {
	
	private Integer relationId;
	private String relationName;
	private Set<Contact> contactSet = new HashSet<Contact>();
	
	public Relation() {
		super();
	}

	public Relation(Integer relationId, String relationName,
			Set<Contact> contactSet) {
		super();
		this.relationId = relationId;
		this.relationName = relationName;
		this.contactSet = contactSet;
	}

	public Integer getRelationId() {
		return relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public Set<Contact> getContactSet() {
		return contactSet;
	}

	public void setContactSet(Set<Contact> contactSet) {
		this.contactSet = contactSet;
	}

}
