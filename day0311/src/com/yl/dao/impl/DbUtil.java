package com.yl.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateUtil;

public class DbUtil<E> {
	
	private void setCondition(Query query, Object... params) {
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
	}
	
	public List<E> queryList(String hql , Integer currentPage , Integer pageSize , Object... params){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		this.setCondition(query, params);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	public List<E> queryAll(String hql , Object... params){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		this.setCondition(query, params);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	public E queryEntity(String hql , Object... params){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		this.setCondition(query, params);
		@SuppressWarnings("unchecked")
		E entity = (E) query.uniqueResult();
		HibernateUtil.close();
		return entity;
	}
	
	public void saveOrUpdateEntity(E entity){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		HibernateUtil.close();
	}
	
	public void del(E entity){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		HibernateUtil.close();
	}
	
	public int getCount(String hql){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		Long count = (Long) query.uniqueResult();
		HibernateUtil.close();
		return count.intValue();
	}
	
}
