package com.yl.dao;

import java.util.List;

import com.yl.pojo.People;

public class PeopleDao extends BaseDao<People> {
	
	public List<People> queryList(){
		String hql = "select p from People p left join fetch p.card";
		return super.queryList(hql);
	}
	
	public People queryById(Integer id){
		String hql = "select p from People p left join fetch p.card where p.pId = ?";
		return super.queryById(hql, id);
	}
	
	public void saveOrUpdate(People people){
		super.saveOrUpdate(people);
	}
	
	public void del(People people){
		super.del(people);
	}
	
	public void remove(Integer id){
		String hql = "delete from People where pId = ?";
		super.remove(hql, id);
	}
}
