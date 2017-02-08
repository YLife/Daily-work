package com.yl.biz;

import java.util.List;

import com.yl.entity.Dept;

/**
 * 部门信息的业务层接口
 * @author Administrator
 *
 */
public interface DeptBiz {
	List<Dept> findDepts();
}
