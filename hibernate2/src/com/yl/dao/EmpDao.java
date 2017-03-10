package com.yl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.pojo.Emp;
import com.yl.util.HibernateSessionFactory;

public class EmpDao {
	/*private static Emp emp = null;*/
	public static void queryEmp(){
		Session session = HibernateSessionFactory.getSession();
		session.get(Emp.class, 7369);
		 session.get(Emp.class, 7369);
		/*session.clear();*/
		 Emp emp = (Emp) session.get(Emp.class, 7499);
		session.get(Emp.class, 7499);
		//load会优先从缓存中的取数据
		/*emp = (Emp)session.load(Emp.class , 7369);
		session.load(Emp.class , 7788);
		session.load(Emp.class , 7788);*/
		HibernateSessionFactory.closeSession();
	}
	
	public static void queryList(){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Emp");
		query.setCacheable(true);
		List<Emp> list = query.list();
		HibernateSessionFactory.closeSession();
		
	}
	
	public static void main(String[] args) {
		/*EmpDao.queryEmp();*/
		/*System.out.println(emp.getEname());*/
		/*EmpDao.queryEmp();
		EmpDao.queryEmp();
		EmpDao.queryEmp();
		EmpDao.queryEmp();*/
		queryList();
		queryList();
		queryList();
		queryList();
		queryList();
		
	}
}
