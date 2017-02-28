package com.yl.dao;

import java.util.List;

import com.yl.entity.Emp;

public interface EmpDao {
	List<Emp> queryEmps(Integer currentPage , Integer pageSize);
	
	int getCount();
	
	void saveEmp(Emp emp);
}
