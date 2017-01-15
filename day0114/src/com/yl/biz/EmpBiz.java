package com.yl.biz;

import java.util.List;

import com.yl.entity.Emp;

/**
 * ҵ���ӿ�
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
	 * ������ҳ��
	 * @param pageSize ҳ�Ĵ�С
	 * @return ��ҳ��
	 */
	public int getTotalPage(Integer pageSize);
}
