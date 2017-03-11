package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.dao.impl.EmpDaoImpl;
import com.yl.pojo.Emp;
import com.yl.vo.EmpVo;

public class EmpBizImpl implements EmpBiz {
	
	private EmpDao dao = new EmpDaoImpl();
	
	@Override
	public List<Emp> queryList(Integer currentPage, Integer pageSize, EmpVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Emp> queryAll() {
		return dao.queryAll();
	}

	@Override
	public Emp queryEntity(Object id) {
		return dao.queryEntity(id);
	}

	@Override
	public void saveOrUpdate(Emp entity) {
		dao.saveOrUpdateEntity(entity);
	}

	@Override
	public void remove(Emp entity) {
		dao.removeEntity(entity);
	}

	@Override
	public int getCount(Integer pageSize , EmpVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

}
