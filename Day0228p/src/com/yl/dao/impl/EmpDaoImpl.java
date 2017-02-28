package com.yl.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yl.dao.EmpDao;
import com.yl.entity.Emp;

public class EmpDaoImpl extends BaseDao<Emp> implements EmpDao {

	@Override
	public List<Emp> queryEmps(Integer currentPage, Integer pageSize) {
		String sqlId = "com.yl.entity.Emp.queryEmps";
		Map<String, Integer> map = new HashMap<String , Integer>();
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		return super.queryList(sqlId, map);
	}

	@Override
	public int getCount() {
		String sqlId = "com.yl.entity.Emp.getCount";
		return super.getCount(sqlId, null);
	}

	@Override
	public void saveEmp(Emp emp) {
		String sqlId = "com.yl.entity.Emp.addEmp";
		super.saveEntity(sqlId, emp);
	}

}
