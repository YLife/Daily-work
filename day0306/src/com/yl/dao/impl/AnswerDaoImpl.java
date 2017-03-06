package com.yl.dao.impl;

import java.util.Date;

import com.yl.dao.AnswerDao;
import com.yl.dao.QuestionDao;
import com.yl.entity.Answers;
import com.yl.entity.Questions;

public class AnswerDaoImpl extends BaseDao<Answers> implements AnswerDao {
	private QuestionDao dao = new QuestionDaoImpl();
	@Override
	public void saveOrUpdate(Answers entity) {
		super.saveOrUpdate(entity);
		System.out.println(entity.getQuestions().getId());
		Questions questions = dao.queryById(entity.getQuestions().getId());
		questions.setAnswerCount(questions.getAnswerCount() + 1);
		questions.setLastModified(new Date());
		dao.saveOrUpdate(questions);
	}
}
