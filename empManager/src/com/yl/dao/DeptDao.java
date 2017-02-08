package com.yl.dao;

import java.util.List;

import com.yl.entity.Dept;

/**
 * 此接口对持久化操作进行抽象
 * @author Administrator
 *
 */
public interface DeptDao {
	List<Dept> queryAll();
}
