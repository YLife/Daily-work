package com.yl.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateUtil;

public class DbUtil<E> {
	public List<E> queryEmps(String hql , Integer currentPage , Integer pageSize){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	public List<E> queryAll(String hql){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	public E queryById(String hql , Object...params){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		@SuppressWarnings("unchecked")
		E e = (E) query.uniqueResult();
		HibernateUtil.close();
		return e;
	}
	
	public void saveOrUpdateEmp(E entity){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		HibernateUtil.close();
	}
	
	public void delEmp(String hql , Object...params){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		session.beginTransaction();
		query.executeUpdate();
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
