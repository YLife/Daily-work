package com.yl.dao;

import java.util.List;

import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

/**
 * 此接口对持久化操作进行抽象
 * @author Administrator
 *
 */
public interface EmpDao {
	/**
	 * 分页查询员工信息
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @param vo 条件信息
	 * @return 员工集合
	 */
	List<Emp> queryAll(int currentPage , int pageSize , EmpVo vo);
	
	/**
	 * 根据员工编号进行查询
	 * @param id 员工编号
	 * @return 员工实体
	 */
	Emp queryById(int id);
	
	/**
	 * 更新员工信息
	 * @param emp
	 * @return
	 */
	int update(Emp emp);
	
	/**
	 * 获取员工信息总条数
	 * @param vo 条件信息
	 * @return 员工数据总条数
	 */
	int getCount(EmpVo vo);
}
