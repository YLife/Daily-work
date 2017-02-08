package com.yl.dao;

import java.util.List;

import com.yl.entity.Mind;

/**
 * �Գ־û��������г���
 * @author Administrator
 *
 */
public interface MindDao {
	/**
	 * ��ѯ����������Ϣ
	 * @return ������Ϣ����
	 */
	List<Mind> queryAll();
	
	/**
	 * ��ѯָ��������Ϣ
	 * @param id
	 * @return mindʵ��
	 */
	Mind queryById(int id);
	
	/**
	 * �޸�������Ϣ
	 * @param entity
	 * @return ��Ӱ�������
	 */
	int update(Mind entity);
}
