package com.yl.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.pojo.Emp;

@Service
public class EmpBizImpl implements EmpBiz{
	
	private EmpDao empDao;
	
	@Override
	public List<Emp> queryEmps() {
		return empDao.queryEmps();
	}
	
	@Autowired
	public void setDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	
	
}
