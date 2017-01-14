package com.yl.dao;

import java.util.List;

import com.yl.entity.Emp;

/**
 * ����Ա�����ϸĲ��������Ϊ�ӿ�
 * @author Administrator
 *
 */
public interface EmpDao {
	/**
	 * ��ҳ��ѯԱ���б�
	 * @param currentPage ��ǰҳ
	 * @param pageSize	ҳ��С
	 * @return Ա�����󼯺�
	 */
	public List<Emp> querryEmpsByPage(Integer currentPage , Integer pageSize);
	
	public Emp querryEmpById(Integer id);
	
	public int updateEmp(Emp emp);
	
	public int getCount();
}
