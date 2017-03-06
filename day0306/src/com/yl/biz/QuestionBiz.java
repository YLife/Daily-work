package com.yl.biz;

import java.util.List;

import com.yl.entity.Questions;

public interface QuestionBiz {
	List<Questions> queryList();
	
	Questions queryById(Integer id);
	
	void saveOrUpdate(Questions entity);
}
