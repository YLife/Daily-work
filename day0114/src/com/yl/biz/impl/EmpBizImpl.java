package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.config.ApplicationConfig;
import com.yl.dao.EmpDao;
import com.yl.entity.Emp;

public class EmpBizImpl implements EmpBiz {
	EmpDao ed = ApplicationConfig.getInstance();
	@Override
	public List<Emp> querryByPage(Integer currentPage, Integer pageSize) {
		List<Emp> list = ed.querryEmpsByPage(currentPage, pageSize);
		return list;
	}

	@Override
	public Emp querryById(Integer id) {
		return ed.querryEmpById(id);
	}

	@Override
	public int updateEmp(Emp emp) {
		return ed.updateEmp(emp);
	}

	@Override
	public int addEmp(Emp emp) {
		return ed.addEmp(emp);
	}

	@Override
	public int delEmp(Integer id) {
		return ed.delEmp(id);
	}

	@Override
	public int getTotalPage(Integer pageSize) {
		return (ed.getCount() - 1) / pageSize + 1;
	}

}
