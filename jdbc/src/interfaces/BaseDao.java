package interfaces;

import java.util.List;

/**
 * 创建泛型接口,简化DAO层接口的定义
 * @author Administrator
 * @param <E>
 */
public interface BaseDao<E> {
	
	/**
	 * 通过id查询
	 * @param id
	 * @return 对象（E）
	 */
	E queryById(Object id);
	
	/**
	 * 查询所有记录
	 * @return list集合
	 */
	List<E> queryAll();
	
	/**
	 * 插入一条记录
	 * @param entity
	 * @return 受影响的行
	 */
	int save(E entity);
	
	/**
	 * 通过id删除记录
	 * @param id
	 * @return 受影响的行
	 */
	int del(Object id);
	
	/**
	 * 修改记录
	 * @param entity
	 * @return 受影响的行
	 */
	int update(E entity);
}
