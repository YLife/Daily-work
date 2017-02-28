package com.yl.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.yl.util.MybatisUtil;

public class BaseDao<E> {
	
	public List<E> queryAll(String sqlId , Object params){
		SqlSession session = MybatisUtil.getSession();
		List<E> list = session.selectList(sqlId, params);
		MybatisUtil.close();
		return list;
	}
	
	public List<E> queryList(String sqlId , Map<?, ?> map){
		SqlSession session = MybatisUtil.getSession();
		List<E> list = session.selectList(sqlId, map);
		MybatisUtil.close();
		return list;
	}
	
	public int getCount(String sqlId , Object params){
		SqlSession session = MybatisUtil.getSession();
		Integer count = session.selectOne(sqlId, params);
		MybatisUtil.close();
		return count.intValue();
	}
	
	public void saveEntity(String sqlId , E entity){
		SqlSession session = MybatisUtil.getSession();
		session.insert(sqlId , entity);
		session.commit();
		MybatisUtil.close();
	}
 }
