package com.yl.interfaces.dao;

import java.util.List;

/**
 * �������ͽӿڣ���dao�����
 * @author Administrator
 *
 * @param <E>
 */
public interface BaseDao<E> {
	/**
	 * ͨ��id��ѯ��¼
	 * @param id
	 * @return
	 */
	E queryById(Object id);
	
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<E> queryAll();
	
	/**
	 * ���һ����¼
	 * @param entity
	 * @return
	 */
	int add(E entity);
	
	/**
	 * ͨ��idɾ����¼
	 * @param id
	 * @return
	 */
	int delete(Object id);
	
	/**
	 * �޸ļ�¼
	 * @param entity
	 * @return
	 */
	int update(E entity);
	
	
}
