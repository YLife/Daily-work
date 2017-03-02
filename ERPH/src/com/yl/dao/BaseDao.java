package com.yl.dao;

import java.util.List;

/**
 * �������ͽӿڣ������ݷ��ʲ�ӿ�
 * @author Mr.Yang
 *
 * @param <E>
 * @param <T>
 */
public interface BaseDao<E, T> {
	
	/**
	 * ��ҳ��ѯ
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @return ʵ����󼯺�
	 */
	List<E> queryList(Integer currentPage , Integer pageSize , T vo);
	
	/**
	 * ��ѯ���м�¼
	 * @return ʵ����󼯺�
	 */
	List<E> queryAll();
	
	/**
	 * ���ݱ�Ų�ѯ��¼
	 * @param id ���
	 * @return ʵ�����
	 */
	E queryById(Object id);
	
	/**
	 * ��ӻ��޸ļ�¼
	 * @param entity ʵ�����
	 */
	void saveOrUpdate(E entity);
	
	/**
	 * ͨ�����ɾ����¼
	 * @param id ���
	 */
	void del(Object id);
	
	/**
	 * ��ѯ��¼������
	 * @param vo ��������
	 * @return ������
	 */
	int getCount(T vo);
	
}
