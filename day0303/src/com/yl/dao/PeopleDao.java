package com.yl.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.entity.Card;
import com.yl.entity.People;
import com.yl.util.HibernateSessionFactory;


public class PeopleDao {
	
	public List<People> queryAll(){
		String hql = "select p from People p left join fetch p.card";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<People> list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public void save(People people ,Card card){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.saveOrUpdate(card);
		session.saveOrUpdate(people);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
	
}
