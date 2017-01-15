package com.yl.biz;

import java.util.List;

import com.yl.entity.Emp;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface EmpBiz {
	
	public List<Emp> querryByPage(Integer currentPage , Integer pageSize);
	
	public Emp querryById(Integer id);
	
	public int updateEmp(Emp emp);
	
	public int addEmp(Emp emp);
	
	public int delEmp(Integer id);
	
	/**
	 * 计算总页数
	 * @param pageSize 页的大小
	 * @return 总页数
	 */
	public int getTotalPage(Integer pageSize);
}
