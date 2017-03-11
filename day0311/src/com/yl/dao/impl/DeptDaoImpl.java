package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.DeptDao;
import com.yl.pojo.Dept;
import com.yl.vo.DeptVo;

public class DeptDaoImpl extends DbUtil<Dept> implements DeptDao {

	private String setCondition(DeptVo vo, String hql) {
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and hiredate between '"+vo.getBegin()+"' and '"+vo.getEnd()+"'";
				}else {
					hql += " and hiredate >= '"+vo.getBegin()+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and hiredate <= '"+vo.getEnd()+"'";
				}
			}
		}
		return hql;
	}
	
	@Override
	public List<Dept> queryList(Integer currentPage, Integer pageSize, DeptVo vo) {
		String hql = "select d from Dept d left join fetch d.emp where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	@Override
	public List<Dept> queryAll() {
		String hql = "select d from Dept left join fetch d.emp";
		return super.queryAll(hql);
	}

	@Override
	public Dept queryEntity(Object id) {
		String hql = "select d from Dept left join fetch d.emp where deptno = ?";
		return super.queryEntity(hql, id);
	}

	@Override
	public void saveOrUpdateEntity(Dept entity) {
		super.saveOrUpdateEntity(entity);
	}

	@Override
	public void removeEntity(Dept entity) {
		super.del(entity);
	}

	@Override
	public int getCount(DeptVo vo) {
		String hql = "select count(1) form Dept d left join d.emp where 1=1";
		this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
