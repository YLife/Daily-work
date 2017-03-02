package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpTypeDao;
import com.yl.entity.EmpType;
import com.yl.vo.EmpTypeVo;

public class EmpTypeDaoImpl extends DbUtil<EmpType> implements EmpTypeDao {

	@Override
	public List<EmpType> queryList(Integer currentPage, Integer pageSize,
			EmpTypeVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpType> queryAll() {
		String hql = "select t from EmpType t";
		return super.queryAll(hql);
	}

	@Override
	public EmpType queryById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(EmpType entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(EmpTypeVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
