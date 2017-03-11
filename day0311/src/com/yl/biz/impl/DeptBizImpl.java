package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.DeptBiz;
import com.yl.dao.DeptDao;
import com.yl.dao.impl.DeptDaoImpl;
import com.yl.pojo.Dept;
import com.yl.vo.DeptVo;

public class DeptBizImpl implements DeptBiz {
	
	private DeptDao dao = new DeptDaoImpl(); 
	
	@Override
	public List<Dept> queryList(Integer currentPage, Integer pageSize, DeptVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Dept> queryAll() {
		return dao.queryAll();
	}

	@Override
	public Dept queryEntity(Object id) {
		return dao.queryEntity(id);
	}

	@Override
	public void saveOrUpdate(Dept entity) {
		dao.saveOrUpdateEntity(entity);
	}

	@Override
	public void remove(Dept entity) {
		dao.removeEntity(entity);
	}

	@Override
	public int getCount(Integer pageSize , DeptVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

}
