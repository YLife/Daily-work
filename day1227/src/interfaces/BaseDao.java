package interfaces;

import java.util.List;

/**
 * �������ͽӿ�,��DAO��ӿڵĶ���
 * @author Administrator
 * @param <E>
 */
public interface BaseDao<E> {
	
	/**
	 * ͨ��id��ѯ
	 * @param id
	 * @return ����E��
	 */
	E queryById(Object id);
	
	/**
	 * ��ѯ���м�¼
	 * @return list����
	 */
	List<E> queryAll();
	
	/**
	 * ����һ����¼
	 * @param entity
	 * @return ��Ӱ�����
	 */
	int save(E entity);
	
	/**
	 * ͨ��idɾ����¼
	 * @param id
	 * @return ��Ӱ�����
	 */
	int del(Object id);
	
	/**
	 * �޸ļ�¼
	 * @param entity
	 * @return ��Ӱ�����
	 */
	int update(E entity);
}
