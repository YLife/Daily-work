package com.yl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateSessionFactory;

public class BaseDao<E> {
	
	public List<E> queryList(String hql){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public E queryById(String hql , Object id){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
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
	
	public void del(E entity){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
	
	public void remove(String hql , Object id){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
}
