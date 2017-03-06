package com.yl.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Questions entity. @author MyEclipse Persistence Tools
 */

public class Questions implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String detailDesc;
	private Integer answerCount;
	private Date lastModified;
	private Set<Answers> answerses = new HashSet<Answers>();

	// Constructors

	/** default constructor */
	public Questions() {
	}

	/** minimal constructor */
	public Questions(String title, String detailDesc, Integer answerCount,
			Date lastModified) {
		this.title = title;
		this.detailDesc = detailDesc;
		this.answerCount = answerCount;
		this.lastModified = lastModified;
	}

	/** full constructor */
	public Questions(String title, String detailDesc, Integer answerCount,
			Date lastModified, Set answerses) {
		this.title = title;
		this.detailDesc = detailDesc;
		this.answerCount = answerCount;
		this.lastModified = lastModified;
		this.answerses = answerses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetailDesc() {
		return this.detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public Integer getAnswerCount() {
		return this.answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set getAnswerses() {
		return this.answerses;
	}

	public void setAnswerses(Set answerses) {
		this.answerses = answerses;
	}

}