package com.yl.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yl.util.HibernateUtil;

/**
 * ��������Դ����ץȡ���ͷ�
 * @author Mr.Yang
 *
 * @param <E>
 */
public class DbUtil<E> {
	
	/**
	 * ��ҳ��ѯ
	 * @param hql ��ѯ���
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @return ʵ����󼯺�
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
	 * ��ѯ���м�¼
	 * @param hql ��ѯ���
	 * @return ʵ����󼯺�
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
	 * ͨ����Ų�ѯ��¼
	 * @param hql ��ѯ���
	 * @param id ���
	 * @return ʵ�����
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
	 * ��ѯ��¼������
	 * @param hql ��ѯ���
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
	 * ���¼�¼
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
	 * ���ݱ��ɾ����¼
	 * @param hql ��ѯ���
	 * @param id ���
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
