package com.yl.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yl.dao.BillTypeDao;
import com.yl.pojo.BillType;

public class BillTypeDaoImpl extends HibernateDaoSupport implements BillTypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<BillType> queryTypes() {
		String hql = "from BillType";
		return super.getHibernateTemplate().find(hql);
	}

}
