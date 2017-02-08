package com.yl.biz;

import java.util.List;

import com.yl.entity.Mind;

public interface MindBiz {
	Mind findById(int id);
	
	List<Mind> findAll();
	
	int edit(Mind entity);
}
