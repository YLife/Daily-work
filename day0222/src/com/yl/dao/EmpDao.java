package com.yl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.entity.Dept;
import com.yl.entity.Emp;
import com.yl.util.HibernateUtil;

public class EmpDao {
	
	public List<Emp> queryAll(){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Emp");
		@SuppressWarnings("unchecked")
		List<Emp> list = query.list();
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEname() + ":"+ list.get(i).getDept().getDname());
		}*/
		HibernateUtil.closeSession();
		return list;
	}
	
	public void save(Emp emp , Dept dept){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(dept);
		session.save(emp);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}
	
	//左连接
	public List<Object[]> queryByLeftJoin(){
		String hql = "from Emp e left join e.dept d";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Object[]> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	//迫切左连接
	public List<Emp> queryByLeftJoinFetch(){
		String hql = "from Emp e left join fetch e.dept d";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Emp> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	
	//内连接
	public List<Object[]> queryByInnerJoin(){
		String hql = "from Emp e inner join e.dept d";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Object[]> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	//迫切内连接
	public List<Emp> queryByInnerJoinFetch(){
		String hql = "from Emp e inner join fetch e.dept d";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Emp> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	//右连接
	
	public List<Object[]> queryByRightJoin(){
		String hql = "from Emp e right join e.dept d";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		List<Object[]> list = query.list();
		HibernateUtil.closeSession();
		return list;
	}
	
	//获取总条数
	public int getCount(){
		String hql = "select count(e) from Emp e";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		Long count = (Long)query.uniqueResult();
		HibernateUtil.closeSession();
		return count.intValue();
	}
	
	//通过id查询
	public Emp queryById(int id){
		String hql = "from Emp where empno = ?";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		Emp emp = (Emp)query.uniqueResult();
		HibernateUtil.closeSession();
		return emp;
	}
	
	//查询最高薪水，最低薪水，平均薪水
	public Object[] query(){
		String hql = "select max(e.sal) , min(e.sal) , avg(e.sal) from Emp e";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		Object[] objects = (Object[]) query.uniqueResult();
		HibernateUtil.closeSession();
		return objects;
	}
}
