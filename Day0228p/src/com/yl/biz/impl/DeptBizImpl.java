package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.DeptBiz;
import com.yl.dao.DeptDao;
import com.yl.dao.impl.DeptDaoImpl;
import com.yl.entity.Dept;

public class DeptBizImpl implements DeptBiz {
	private DeptDao dao = new DeptDaoImpl();
	
	@Override
	public List<Dept> queryDepts() {
		return dao.queryDepts();
	}

}
