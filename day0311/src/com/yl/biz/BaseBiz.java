package com.yl.biz;

import java.util.List;

public interface BaseBiz<E, T> {
	
	List<E> queryList(Integer currentPage , Integer pageSize , T vo);
	
	List<E> queryAll();
	
	E queryEntity(Object id);
	
	void saveOrUpdate(E entity);
	
	void remove(E entity);
	
	int getCount(Integer pageSize , T vo);
	
	
}
