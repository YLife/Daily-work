package com.yl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yl.pojo.Emp;
import com.yl.util.HibernateUtil;

/**
 * ³Ö¾Ã²ã
 * @author Mr.Yang
 *
 */
public class EmpDao {
	
	public Emp queryById(int empno){
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Emp emp = (Emp)session.get(Emp.class, empno);
		session.close();
		return emp;
	}
	
	public void savaEmp(Emp emp){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
	
	public void removeEmp(Emp emp){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(emp);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
	
	public void updateEmp(Emp emp){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.update(emp);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
	
}
