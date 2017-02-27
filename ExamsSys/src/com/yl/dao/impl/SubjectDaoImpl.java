package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.SubjectDao;
import com.yl.entity.Subject;

public class SubjectDaoImpl extends DbUtil<Subject> implements SubjectDao {

	@Override
	public List<Subject> querySubjects() {
		String hql = "from Subject";
		return super.queryAll(hql);
	}

	@Override
	public Subject queryById(Integer id) {
		String hql = "select s from Subject s where s.subjectId = ?";
		return super.queryById(hql, id);
	}

}
