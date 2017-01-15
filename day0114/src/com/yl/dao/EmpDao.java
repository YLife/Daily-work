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
	
	/**
	 * 通过编号查询员工信息
	 * @param id 编号
	 * @return 员工对象
	 */
	public Emp querryEmpById(Integer empno);
	
	/**
	 * 更新员工信息
	 * @param emp 员工对象
	 * @return 受影响的行
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * 新增员工信息
	 * @param emp 员工对象
	 * @return 受影响的行
	 */
	public int addEmp(Emp emp);
	
	/**
	 * 删除员工信息
	 * @param emp 员工编号
	 * @return 受影响的行
	 */
	public int delEmp(Integer empno);
	
	/**
	 * 查询记录总条数
	 * @return 记录总条数
	 */
	public int getCount();
}
