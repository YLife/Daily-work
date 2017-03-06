package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.QuestionBiz;
import com.yl.dao.QuestionDao;
import com.yl.dao.impl.QuestionDaoImpl;
import com.yl.entity.Questions;

public class QuestionBizImpl implements QuestionBiz {
	private QuestionDao dao = new QuestionDaoImpl();
	@Override
	public List<Questions> queryList() {
		return dao.queryList();
	}

	@Override
	public Questions queryById(Integer id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Questions entity) {
		dao.saveOrUpdate(entity);
	}

}
