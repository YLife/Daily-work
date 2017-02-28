package com.yl.biz;

import java.util.List;

import com.yl.entity.Emp;

public interface EmpBiz {
	public List<Emp> queryEmps(Integer currentPage , Integer pageSize);
	
	public int getTotalPage(Integer pageSzie);
	
	public void saveEmp(Emp emp);
}
