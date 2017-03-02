package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpTypeBiz;
import com.yl.dao.EmpTypeDao;
import com.yl.dao.impl.EmpTypeDaoImpl;
import com.yl.entity.EmpType;
import com.yl.vo.EmpTypeVo;

public class EmpTypeBizImpl implements EmpTypeBiz {
	private EmpTypeDao dao = new EmpTypeDaoImpl();
	@Override
	public List<EmpType> findList(Integer currentPage, Integer pageSize,
			EmpTypeVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpType> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpType findById(Object id) {
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
	public int getTotalPage(Integer pageSize, EmpTypeVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
