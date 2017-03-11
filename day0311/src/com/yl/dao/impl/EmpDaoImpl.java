package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpDao;
import com.yl.pojo.Emp;
import com.yl.vo.EmpVo;

public class EmpDaoImpl extends DbUtil<Emp> implements EmpDao {

	@Override
	public List<Emp> queryList(Integer currentPage, Integer pageSize, EmpVo vo) {
		String hql = "select e from Emp e left join fetch e.dept where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(EmpVo vo, String hql) {
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
	public List<Emp> queryAll() {
		String hql = "select e from Emp e left join fetch e.dept";
		return super.queryAll(hql);
	}

	@Override
	public Emp queryEntity(Object id) {
		String hql = "select e from Emp e left join fetch e.dept where empno = ?";
		return super.queryEntity(hql, id);
	}

	@Override
	public void saveOrUpdateEntity(Emp entity) {
		super.saveOrUpdateEntity(entity);

	}

	@Override
	public void removeEntity(Emp entity) {
		super.del(entity);

	}

	@Override
	public int getCount(EmpVo vo) {
		String hql = "select count(1) from Emp e left join e.dept where 1=1";
		this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
