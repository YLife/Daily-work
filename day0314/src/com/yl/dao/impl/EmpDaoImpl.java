package com.yl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yl.dao.EmpDao;
import com.yl.pojo.Emp;

public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> queryList() {
		String hql = "from Emp";
		return super.getHibernateTemplate().find(hql);
	}

}
