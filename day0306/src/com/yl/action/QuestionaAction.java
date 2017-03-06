package com.yl.action;

import java.util.Date;
import java.util.List;

import com.yl.biz.AnswerBiz;
import com.yl.biz.QuestionBiz;
import com.yl.biz.impl.AnswerBizImpl;
import com.yl.biz.impl.QuestionBizImpl;
import com.yl.entity.Answers;
import com.yl.entity.Questions;

public class QuestionaAction {
	private QuestionBiz qbiz = new QuestionBizImpl();
	private AnswerBiz abiz = new AnswerBizImpl();
	private Questions questions;
	private Answers answers;
	private List<Questions> list;
	//查询所有记录
	public String list(){
		list = qbiz.queryList();
		return "list";
	}
	
	//保存问题
	public String addQuestion(){
		questions.setLastModified(new Date());
		questions.setAnswerCount(Integer.valueOf(0));
		qbiz.saveOrUpdate(questions);
		return "add";
	}
	
	//查看问题及评论
	public String load(){
		questions =  qbiz.queryById(questions.getId());
		return "load";
	}
	
	//保存评论
	public String save(){
		answers.setQuestions(questions);
		answers.setAnsDate(new Date());
		abiz.saveOrUpdate(answers);
		return "save";
	}
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	public Answers getAnswers() {
		return answers;
	}
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	public List<Questions> getList() {
		return list;
	}
	public void setList(List<Questions> list) {
		this.list = list;
	}
}
