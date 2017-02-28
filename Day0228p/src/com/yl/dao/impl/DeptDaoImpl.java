package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.DeptDao;
import com.yl.entity.Dept;

public class DeptDaoImpl extends BaseDao<Dept> implements DeptDao {

	@Override
	public List<Dept> queryDepts() {
		String sqlId = "com.yl.entity.Dept.queryDepts";
		return super.queryAll(sqlId, null);
	}

}
