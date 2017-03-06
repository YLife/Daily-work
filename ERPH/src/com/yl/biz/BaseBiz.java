package com.yl.biz;

import java.util.List;

/**
 * �������ͽӿ� �� ��ҵ���ӿ�
 * @author Mr.Yang
 *
 * @param <E>
 * @param <T>
 */
public interface BaseBiz<E, T> {
	
	/**
	 * ��ҳ��ѯ
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @return ʵ����󼯺�
	 */
	List<E> findList(Integer currentPage , Integer pageSize , T vo);
	
	/**
	 * ��ѯ���м�¼
	 * @return ʵ����󼯺�
	 */
	List<E> findAll();
	
	/**
	 * ���ݱ�Ų�ѯ��¼
	 * @param id ���
	 * @return ʵ�����
	 */
	E findById(Object id);
	
	/**
	 * ���ӻ��޸ļ�¼
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
	int getTotalPage(Integer pageSize , T vo);
}