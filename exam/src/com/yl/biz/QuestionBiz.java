package com.yl.biz;

import java.util.List;

import com.yl.entity.Question;

public interface QuestionBiz {
	List<Question> findAll();
	
	List<Question> findBySubject(int subject);
	
	int saveQuestion(Question question);
}
