package dao;

import java.util.List;

/*
 * 使用泛型接口简化DAO层接口的定义
 */
public interface BaseDao<E> {
	E queryById(Object id);
	
	List<E> queryAll();
	
	int save(E entity);
	
	int del(Object id);
	
	int update(E entity);
}
