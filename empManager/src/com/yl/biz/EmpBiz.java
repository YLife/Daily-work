package com.yl.biz;

import java.util.List;

import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

/**
 * ҵ���ӿ�
 * @author Administrator
 *
 */
public interface EmpBiz {
	/**
	 * ��ҳ��ѯԱ����Ϣ
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return
	 */
	List<Emp> findEmps(int currentPage , int pageSize , EmpVo vo);
	
	/**
	 * ͨ��Ա����Ų�ѯԱ����Ϣ
	 * @param empNo
	 * @return
	 */
	Emp findEmp(int empNo);
	
	/**
	 * ����Ա����Ϣ
	 * @param emp
	 * @return
	 */
	int updateEmp(Emp emp);
	
	/**
	 * ��ȡԱ����Ϣ������
	 * @param vo ������Ϣ
	 * @return ������
	 */
	int getTotalPage(EmpVo vo , int pageSize);
}
