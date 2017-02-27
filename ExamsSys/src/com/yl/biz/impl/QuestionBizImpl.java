package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.QuestionBiz;
import com.yl.dao.QuestionDao;
import com.yl.entity.Question;
import com.yl.vo.QuestionVo;
import com.yl.dao.impl.QuestionDaoImpl;

public class QuestionBizImpl implements QuestionBiz {
	private QuestionDao dao = new QuestionDaoImpl();
	@Override
	public List<Question> queryQuestions(Integer currentPage, Integer pageSize,
			QuestionVo vo) {
		return dao.queryQuestion(currentPage, pageSize, vo);
	}

	@Override
	public Question queryQuestion(Integer id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdateQuestion(Question question) {
		dao.saveOrUpdateQuestion(question);
	}

	@Override
	public void removeById(Integer id) {
		dao.removeQuestion(id);
	}

	@Override
	public int getTotalPage(Integer pageSize, QuestionVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

}
