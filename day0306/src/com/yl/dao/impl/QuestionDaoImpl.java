package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.QuestionDao;
import com.yl.entity.Questions;

public class QuestionDaoImpl extends BaseDao<Questions> implements QuestionDao{

	@Override
	public List<Questions> queryList() {
		String hql = "from Questions";
		return super.queryList(hql);
	}

	@Override
	public Questions queryById(Integer id) {
		String hql = "from Questions q left join fetch q.answerses a where q.id = ?";
		return super.queryById(hql, id);
	}
	
	@Override
	public void saveOrUpdate(Questions entity) {
		super.saveOrUpdate(entity);
	}

}
