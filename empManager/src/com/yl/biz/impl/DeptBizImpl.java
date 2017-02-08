package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.DeptBiz;
import com.yl.dao.DeptDao;
import com.yl.dao.impl.DeptImpl;
import com.yl.entity.Dept;

public class DeptBizImpl implements DeptBiz {
	
	private DeptDao dao = new DeptImpl();
	@Override
	public List<Dept> findDepts() {
		return dao.queryAll();
	}

}
