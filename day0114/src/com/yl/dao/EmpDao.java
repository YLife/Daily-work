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
	
	/**
	 * ͨ����Ų�ѯԱ����Ϣ
	 * @param id ���
	 * @return Ա������
	 */
	public Emp querryEmpById(Integer empno);
	
	/**
	 * ����Ա����Ϣ
	 * @param emp Ա������
	 * @return ��Ӱ�����
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * ����Ա����Ϣ
	 * @param emp Ա������
	 * @return ��Ӱ�����
	 */
	public int addEmp(Emp emp);
	
	/**
	 * ɾ��Ա����Ϣ
	 * @param emp Ա�����
	 * @return ��Ӱ�����
	 */
	public int delEmp(Integer empno);
	
	/**
	 * ��ѯ��¼������
	 * @return ��¼������
	 */
	public int getCount();
}
