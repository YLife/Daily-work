package dao;

import java.util.List;

/*
 * ʹ�÷��ͽӿڼ�DAO��ӿڵĶ���
 */
public interface BaseDao<E> {
	E queryById(Object id);
	
	List<E> queryAll();
	
	int save(E entity);
	
	int del(Object id);
	
	int update(E entity);
}
