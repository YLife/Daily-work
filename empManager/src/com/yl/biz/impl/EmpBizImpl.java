package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.dao.impl.EmpImpl;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpBizImpl implements EmpBiz {
	private EmpDao ed = new EmpImpl();
	@Override
	public List<Emp> findEmps(int currentPage, int pageSize, EmpVo vo) {
		List<Emp> list = ed.queryAll(currentPage, pageSize, vo);
		return list;
	}

	@Override
	public Emp findEmp(int empNo) {
		return ed.queryById(empNo);
	}

	@Override
	public int updateEmp(Emp emp) {
		return ed.update(emp);
	}

	@Override
	public int getTotalPage(EmpVo vo , int pageSize) {
		return (ed.getCount(vo) - 1) / pageSize + 1;
	}

}
