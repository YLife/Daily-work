package com.yl.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateUtil;

/**
 * 对数据资源进行抓取、释放
 * @author Mr.Yang
 *
 * @param <E>
 */
public class DbUtil<E> {
	
	/**
	 * 分页查询
	 * @param hql 查询语句
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @return 实体对象集合
	 */
	public List<E> queryList(String hql , Integer currentPage , Integer pageSize){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	/**
	 * 查询所有记录
	 * @param hql 查询语句
	 * @return 实体对象集合
	 */
	public List<E> queryAll(String hql){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<E> list = query.list();
		HibernateUtil.close();
		return list;
	}
	
	/**
	 * 通过编号查询记录
	 * @param hql 查询语句
	 * @param id 编号
	 * @return 实体对象
	 */
	public E queryById(String hql , Object id){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		@SuppressWarnings("unchecked")
		E entity = (E) query.uniqueResult();
		HibernateUtil.close();
		return entity;
	}
	
	/**
	 * 查询记录总条数
	 * @param hql 查询语句
	 * @return
	 */
	public int getCount(String hql){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		Long count = (Long) query.uniqueResult();
		HibernateUtil.close();
		return count.intValue();
	}
	
	/**
	 * 更新记录
	 * @param entity
	 */
	public void saveOrUpdate(E entity){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		HibernateUtil.close();
	}
	
	/**
	 * 根据编号删除记录
	 * @param hql 查询语句
	 * @param id 编号
	 */
	public void del(String hql , Object id){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateUtil.close();
	}
	
	
}
