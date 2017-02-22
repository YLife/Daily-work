package com.yl.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.entity.Dept;
import com.yl.entity.Emp;
import com.yl.util.HibernateUtil;

public class DeptDao {
	public List<Dept> queryDepts(){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Dept");
		@SuppressWarnings("unchecked")
		List<Dept> list = query.list();
		for (Dept dept : list) {
			System.out.println(dept.getDname() + ":");
			for(Iterator<Emp> iterator = dept.getEmpSet().iterator() ; iterator.hasNext();){
				Emp emp = (Emp) iterator.next();
				System.out.println("\t" + emp.getEname());
			}
		}
		HibernateUtil.closeSession();
		return list;
	}
	
	public void removeDept(){
		Session session = HibernateUtil.getSession();
		Dept dept = (Dept) session.get(Dept.class, 14);
		session.beginTransaction();
		session.delete(dept);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
}
