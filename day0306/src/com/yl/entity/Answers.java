package com.yl.entity;

import java.util.Date;

/**
 * Answers entity. @author MyEclipse Persistence Tools
 */

public class Answers implements java.io.Serializable {

	// Fields

	private Integer id;
	private Questions questions;
	private String ansContent;
	private Date ansDate;

	// Constructors

	/** default constructor */
	public Answers() {
	}

	/** full constructor */
	public Answers(Questions questions, String ansContent, Date ansDate) {
		this.questions = questions;
		this.ansContent = ansContent;
		this.ansDate = ansDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return this.questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public String getAnsContent() {
		return this.ansContent;
	}

	public void setAnsContent(String ansContent) {
		this.ansContent = ansContent;
	}

	public Date getAnsDate() {
		return this.ansDate;
	}

	public void setAnsDate(Date ansDate) {
		this.ansDate = ansDate;
	}

}