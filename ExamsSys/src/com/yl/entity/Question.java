package com.yl.entity;

public class Question {
	private Integer q_id;
	private String question;
	private String option_a;
	private String option_b;
	private String option_c;
	private String option_d;
	private String answer;
	private Subject subject;
	
	public Question() {
		super();
	}

	public Question(Integer q_id, String question, String option_a,
			String option_b, String option_c, String option_d, Subject subject,
			String answer) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;
		this.subject = subject;
		this.answer = answer;
	}

	public Integer getQ_id() {
		return q_id;
	}

	public void setQ_id(Integer q_id) {
		this.q_id = q_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption_a() {
		return option_a;
	}

	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}

	public String getOption_b() {
		return option_b;
	}

	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}

	public String getOption_c() {
		return option_c;
	}

	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}

	public String getOption_d() {
		return option_d;
	}

	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
