package com.yl.biz;

import java.util.List;

import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface EmpBiz {
	/**
	 * 分页查询员工信息
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return
	 */
	List<Emp> findEmps(int currentPage , int pageSize , EmpVo vo);
	
	/**
	 * 通过员工编号查询员工信息
	 * @param empNo
	 * @return
	 */
	Emp findEmp(int empNo);
	
	/**
	 * 更新员工信息
	 * @param emp
	 * @return
	 */
	int updateEmp(Emp emp);
	
	/**
	 * 获取员工信息总条数
	 * @param vo 条件信息
	 * @return 总条数
	 */
	int getTotalPage(EmpVo vo , int pageSize);
}
