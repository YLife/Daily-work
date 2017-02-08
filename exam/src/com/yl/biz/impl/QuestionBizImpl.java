package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.QuestionBiz;
import com.yl.dao.QuestuionDao;
import com.yl.dao.impl.QuestionImpl;
import com.yl.entity.Question;

public class QuestionBizImpl implements QuestionBiz{
	private QuestuionDao qd = new QuestionImpl();
	@Override
	public List<Question> findAll() {
		return qd.queryAll();
	}

	@Override
	public List<Question> findBySubject(int subject) {
		return qd.queryBySubject(subject);
	}

	@Override
	public int saveQuestion(Question question) {
		return qd.addQuestion(question);
	}

}
