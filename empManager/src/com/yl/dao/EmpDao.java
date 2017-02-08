package com.yl.dao;

import java.util.List;

import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

/**
 * �˽ӿڶԳ־û��������г���
 * @author Administrator
 *
 */
public interface EmpDao {
	/**
	 * ��ҳ��ѯԱ����Ϣ
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @return Ա������
	 */
	List<Emp> queryAll(int currentPage , int pageSize , EmpVo vo);
	
	/**
	 * ����Ա����Ž��в�ѯ
	 * @param id Ա�����
	 * @return Ա��ʵ��
	 */
	Emp queryById(int id);
	
	/**
	 * ����Ա����Ϣ
	 * @param emp
	 * @return
	 */
	int update(Emp emp);
	
	/**
	 * ��ȡԱ����Ϣ������
	 * @param vo ������Ϣ
	 * @return Ա������������
	 */
	int getCount(EmpVo vo);
}
