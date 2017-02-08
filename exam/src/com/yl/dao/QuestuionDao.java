package com.yl.dao;

import java.util.List;

import com.yl.entity.Question;

public interface QuestuionDao {
	List<Question> queryAll();
	
	List<Question> queryBySubject(int subject);
	
	int addQuestion(Question question);
}
