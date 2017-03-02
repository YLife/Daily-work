package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpRoleDao;
import com.yl.entity.EmpRole;
import com.yl.vo.EmpRoleVo;

public class EmpRoleDaoImpl extends DbUtil<EmpRole> implements EmpRoleDao {

	@Override
	public List<EmpRole> queryList(Integer currentPage, Integer pageSize,
			EmpRoleVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpRole> queryAll() {
		String hql = "from EmpRole r";
		return super.queryAll(hql);
	}

	@Override
	public EmpRole queryById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(EmpRole entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(EmpRoleVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
