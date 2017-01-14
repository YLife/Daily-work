package com.yl.dao;

import java.util.List;

import com.yl.entity.Emp;

/**
 * 将雇员的增上改查操作抽象为接口
 * @author Administrator
 *
 */
public interface EmpDao {
	/**
	 * 分页查询员工列表
	 * @param currentPage 当前页
	 * @param pageSize	页大小
	 * @return 员工对象集合
	 */
	public List<Emp> querryEmpsByPage(Integer currentPage , Integer pageSize);
	
	public Emp querryEmpById(Integer id);
	
	public int updateEmp(Emp emp);
	
	public int getCount();
}
