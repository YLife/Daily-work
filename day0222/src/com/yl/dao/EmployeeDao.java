package com.yl.dao;

import org.hibernate.Session;

import com.yl.entity.Employee;
import com.yl.entity.Project;
import com.yl.util.HibernateUtil;


public class EmployeeDao {
	public void save(){
		Employee emp = new Employee();
		emp.setEname("Íõ¶þÐ¡");
		Project pro = new Project();
		pro.setPname("åÞ¹·");
		emp.getProSet().add(pro);
		pro.getEmpSet().add(emp);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(emp);
		session.save(pro);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
}
