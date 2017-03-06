package com.yl.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateSessionFactory;

public class BaseDao<E> {
	
	public List<E> queryList(String hql , Object...params){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i , params[i]);
			}
		}
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public E queryById (String hql , Object...params){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i , params[i]);				
			}
		}
		@SuppressWarnings("unchecked")
		E entity = (E) query.uniqueResult();
		HibernateSessionFactory.closeSession();
		return entity;
	}
	
	public void saveOrUpdate(E entity){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
	
	public void update(String hql , Object...params){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
}
