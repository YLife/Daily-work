package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.dao.impl.EmpDaoImpl;
import com.yl.entity.Emp;

public class EmpBizImpl implements EmpBiz {
	private EmpDao dao = new EmpDaoImpl();
	@Override
	public List<Emp> queryEmps(Integer currentPage, Integer pageSize) {
		return dao.queryEmps(currentPage, pageSize);
	}

	@Override
	public int getTotalPage(Integer pageSzie) {
		return (dao.getCount() - 1) / pageSzie + 1;
	}

	@Override
	public void saveEmp(Emp emp) {
		dao.saveEmp(emp);
	}

}
