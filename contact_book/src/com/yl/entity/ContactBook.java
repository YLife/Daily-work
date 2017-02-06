package com.yl.entity;

/**
 * 实体类，联系人信息
 * @author Administrator
 *
 */

public class ContactBook {
	private int contactId;
	private String contactName;
	private String contactPhone;
	private String contactMail;
	private String relation;
	
	public ContactBook() {
		super();
	}

	public ContactBook(int contactId, String contactName, String contactPhone,
			String contactMail, String relation) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.contactMail = contactMail;
		this.relation = relation;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
}
