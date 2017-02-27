package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.QuestionDao;
import com.yl.entity.Question;
import com.yl.vo.QuestionVo;

public class QuestionDaoImpl extends DbUtil<Question> implements QuestionDao {

	@Override
	public List<Question> queryQuestion(Integer currentPage, Integer pageSize,
			QuestionVo vo) {
		String hql = "select q from Question q left join fetch q.subject where 1=1";
		hql = setCondition(vo, hql);
		return super.queryEmps(hql, currentPage, pageSize);
	}
	
	private String setCondition(QuestionVo vo, String hql) {
		if (vo != null) {
			if (vo.getSubjectId() != null) {
				hql += " and q.subject.subjectId = "+vo.getSubjectId()+"";
			}
		}
		return hql;
	}
	@Override
	public Question queryById(Integer id) {
		String hql = "select q from Question q where q.q_id = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdateQuestion(Question question) {
		super.saveOrUpdateEmp(question);
	}

	@Override
	public void removeQuestion(Integer id) {
		String hql = "delete from Question q where q.q_id = ?";
		super.delEmp(hql, id);
	}

	@Override
	public int getCount(QuestionVo vo) {
		String hql = "select count(q) from Question q where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
