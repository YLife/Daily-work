package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.EmpDao;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpDaoImpl extends DbUtil<Emp> implements EmpDao {

	@Override
	public List<Emp> queryList(Integer currentPage, Integer pageSize, EmpVo vo) {
		String hql = "select e from Emp e left join fetch e.empType t left join fetch e.empJob j left join fetch e.empRole r where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(EmpVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and e.empDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and e.empDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}
			if (vo.getBegin() == null) {
				if (vo.getEnd() != null) {
					hql += " and e.empDate <= '"+vo.getEnd()+"'";
				}
			}
		}
		return hql;
	}

	@Override
	public List<Emp> queryAll() {
		return null;
	}

	@Override
	public Emp queryById(Object id) {
		String hql = "select e from Emp e left join fetch e.empType t left join fetch e.empJob j left join fetch e.empRole r where e.empId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(Emp entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from Emp e where e.empId = ?";
		super.del(hql, id);
	}

	@Override
	public int getCount(EmpVo vo) {
		String hql = "select count(e) from Emp e left join e.empType t left join e.empJob j left join e.empRole r where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
