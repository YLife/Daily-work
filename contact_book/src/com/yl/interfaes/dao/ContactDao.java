package com.yl.interfaes.dao;

import java.util.List;

import com.yl.entity.ContactBook;

/**
 * �˽ӿڶԳ־û��������г���
 * @author Administrator
 *
 */
public interface ContactDao {
	/**
	 * ͨ��id��ѯ��ϵ��
	 * @param id
	 * @return ��ϵ��
	 */
	ContactBook queryById(int id);
	
	/**
	 * ��ѯ������ϵ��
	 * @return ��ϵ�˼���
	 */
	List<ContactBook> queryAll();
	
	/**
	 * �����ϵ��
	 * @param entity
	 * @return ��Ӱ�����
	 */
	int addConntact(ContactBook entity);
	
	/**
	 * �޸���ϵ��
	 * @param entity
	 * @return ��Ӱ�����
	 */
	int updateContact(ContactBook entity);
	
	/**
	 * ɾ����ϵ��
	 * @param id
	 * @return ��Ӱ�����
	 */
	int deleteContact(int id);
}
