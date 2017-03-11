package com.yl.dao;

import java.util.List;

public interface BaseDao<E, T> {
	
	List<E> queryList(Integer currentPage , Integer pageSize , T vo);
	
	List<E> queryAll();
	
	E queryEntity(Object id);
	
	void saveOrUpdateEntity(E entity);
	
	void removeEntity(E entity);
	
	int getCount(T vo);
	
}
