package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.SubjectBiz;
import com.yl.dao.SubjectDao;
import com.yl.dao.impl.SubjectDaoImpl;
import com.yl.entity.Subject;

public class SubjectBizImpl implements SubjectBiz {
	private SubjectDao dao = new SubjectDaoImpl();
	@Override
	public List<Subject> querySubjects() {
		return dao.querySubjects();
	}
	@Override
	public Subject queryById(Integer id) {
		return dao.queryById(id);
	}

}
