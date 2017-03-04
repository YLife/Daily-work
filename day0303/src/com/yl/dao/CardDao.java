package com.yl.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.entity.Card;
import com.yl.util.HibernateSessionFactory;


public class CardDao {
	
	public List<Card> queryAll(){
		String hql = "select c from Card c left join fetch c.people";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Card> list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public void save(Card card){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.saveOrUpdate(card);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
}
