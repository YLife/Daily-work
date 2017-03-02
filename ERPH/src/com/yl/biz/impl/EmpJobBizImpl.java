package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpJobBiz;
import com.yl.dao.EmpJobDao;
import com.yl.dao.impl.EmpJobDaoImpl;
import com.yl.entity.EmpJob;
import com.yl.vo.EmpJobVo;

public class EmpJobBizImpl implements EmpJobBiz {
	private EmpJobDao dao = new EmpJobDaoImpl();
	@Override
	public List<EmpJob> findList(Integer currentPage, Integer pageSize,
			EmpJobVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpJob> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpJob findById(Object id) {
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
	public int getTotalPage(Integer pageSize, EmpJobVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
