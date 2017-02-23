package com.yl.entity;
/**
 * 封装联系人信息
 * @author Mr.Yang
 *
 */
public class Contact {
	private Integer contactId;
	private String contactName;
	private String contactPhone;
	private String contactMail;
	private Relation relation;
	
	public Contact() {
		super();
	}

	public Contact(Integer contactId, String contactName, String contactPhone,
			String contactMail, Relation relation) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.contactMail = contactMail;
		this.relation = relation;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactMail() {
		return contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

}
