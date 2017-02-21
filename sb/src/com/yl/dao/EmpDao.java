package com.yl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yl.entity.Emp;

public class EmpDao {
	
	public Emp queryById(Integer empno){
		Configuration configuraiton = new Configuration().configure();
		SessionFactory factory = configuraiton.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println ( session.get(Emp.class, empno));
		Emp emp = (Emp)session.get(Emp.class, empno);
		session.close();
		return emp;
	}
}
