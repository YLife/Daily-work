package com.yl.dao;

import java.util.List;

import com.yl.entity.Subject;

public interface SubjectDao {
	
	List<Subject> querySubjects();
	
	Subject queryById(Integer id);
}
