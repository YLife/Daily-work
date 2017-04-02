package com.yl.dao.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yl.dao.BillsDao;
import com.yl.pojo.Bills;
import com.yl.vo.BillsVo;

public class BillsDaoImpl extends HibernateDaoSupport implements BillsDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Bills> queryBills(BillsVo vo) {
		String hql = "select b from Bills b left join fetch b.billType t where 1=1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getType() != null ) {
				hql += " and b.billType.id = "+vo.getType()+"";
			}
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and b.billTime between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and b.billTime >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and b.billTime <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return super.getHibernateTemplate().find(hql);
	}

	@Override
	public Bills queryBills(final Integer id) {
		final String hql = "select b from Bills b left join fetch b.billType t where b.id = ? ";
		return super.getHibernateTemplate().execute(new HibernateCallback<Bills>() {

			@Override
			public Bills doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query = session.createQuery(hql);
				query.setParameter(0, id);
				return (Bills) query.uniqueResult();
			}
			
		});
	}

	@Override
	public void saveBills(Bills bills) {
		super.getHibernateTemplate().saveOrUpdate(bills);
	}

}
