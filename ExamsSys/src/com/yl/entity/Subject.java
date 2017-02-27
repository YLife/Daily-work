package com.yl.entity;

import java.util.HashSet;
import java.util.Set;

public class Subject {
	private Integer subjectId;
	private String subjectName;
	private Set<Question> questionSet = new HashSet<Question>();
	
	public Subject() {
		super();
	}

	public Subject(Integer subjectId, String subjectName,
			Set<Question> questionSet) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.questionSet = questionSet;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Set<Question> getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(Set<Question> questionSet) {
		this.questionSet = questionSet;
	}

}
