package com.yl.biz;

import java.util.List;

import com.yl.entity.Subject;

public interface SubjectBiz {
	List<Subject> querySubjects();
	
	Subject queryById(Integer id);
}
