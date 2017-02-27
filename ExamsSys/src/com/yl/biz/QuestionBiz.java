package com.yl.biz;

import java.util.List;

import com.yl.entity.Question;
import com.yl.vo.QuestionVo;

public interface QuestionBiz {
	
	List<Question> queryQuestions(Integer currentPage , Integer pageSize , QuestionVo vo);
	
	Question queryQuestion(Integer id);
	
	void saveOrUpdateQuestion(Question question);
	
	void removeById(Integer id);
	
	int getTotalPage(Integer pageSize , QuestionVo vo);
}
