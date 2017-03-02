package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.dao.impl.EmpDaoImpl;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpBizImpl implements EmpBiz {
	private EmpDao dao = new EmpDaoImpl();
	@Override
	public List<Emp> findList(Integer currentPage, Integer pageSize, EmpVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Emp> findAll() {
		return dao.queryAll();
	}

	@Override
	public Emp findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Emp entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public int getTotalPage(Integer pageSize, EmpVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

}
