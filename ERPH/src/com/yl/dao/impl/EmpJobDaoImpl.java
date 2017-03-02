package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpJobDao;
import com.yl.entity.EmpJob;
import com.yl.vo.EmpJobVo;

public class EmpJobDaoImpl extends DbUtil<EmpJob> implements EmpJobDao {

	@Override
	public List<EmpJob> queryList(Integer currentPage, Integer pageSize,
			EmpJobVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpJob> queryAll() {
		String hql = "from EmpJob j";
		return super.queryAll(hql);
	}

	@Override
	public EmpJob queryById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(EmpJob entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(EmpJobVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
