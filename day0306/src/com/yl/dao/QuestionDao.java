package com.yl.dao;

import java.util.List;

import com.yl.entity.Questions;

public interface QuestionDao {
	
	List<Questions> queryList();
	
	Questions queryById(Integer id); 
	
	void saveOrUpdate(Questions entity);
}
