package com.yl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.entity.Contact;
import com.yl.entity.Relation;
import com.yl.util.HibernateUtil;

/**
 * 持久层，对数据库资源进行抓取或释放
 * @author Mr.Yang
 *
 */
public class ContactDao {
	
	public List<Contact> queryContacts(int currentPage , int pageSize){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Contact c left join fetch c.relation r");
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<Contact> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	public int getCount(){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("select count(c) from Contact c");
		Long count = (Long)query.uniqueResult();
		HibernateUtil.closeSession();
		return count.intValue();
	}
	
	public void removeContact(Contact contact){
		Session session = HibernateUtil.getSession();  
		session.beginTransaction();
		session.delete(contact);
		session.getTransaction().commit();
	}
	
	public Contact queryById(int id){
		Session session = HibernateUtil.getSession();
		Contact contact = (Contact)session.get(Contact.class, id);
		HibernateUtil.closeSession();
		return contact;
	}
	
	public void save(Contact contact , Relation relation){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(relation);
		session.save(contact);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
}
