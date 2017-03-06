package com.yl.biz.impl;

import com.yl.biz.AnswerBiz;
import com.yl.dao.AnswerDao;
import com.yl.dao.impl.AnswerDaoImpl;
import com.yl.entity.Answers;

public class AnswerBizImpl implements AnswerBiz {
	private AnswerDao dao = new AnswerDaoImpl();
	@Override
	public void saveOrUpdate(Answers entity) {
		dao.saveOrUpdate(entity);
	}

}
