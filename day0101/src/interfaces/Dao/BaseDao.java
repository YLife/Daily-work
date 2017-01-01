package interfaces.Dao;

import java.util.List;

/**
 * �������ͽӿڣ���DAO��ӿڵĶ���
 * @author YangLun
 * @param <E>		
 */
public interface BaseDao<E> {
	
	/**
	 * ͨ��id��ѯ��¼
	 * @param id
	 * @return E
	 */
	E queryById(Object id);
	
	/**
	 * ��ѯ���м�¼
	 * @return List<E>
	 */
	List<E> queryAll();
	
	/**
	 * ����һ����¼
	 * @param entity
	 * @return	��Ӱ�����
	 */
	int save(E entity);
	
	/**
	 * �޸ļ�¼
	 * @param entity
	 * @return ��Ӱ�����
	 */
	int update(E entity);
	
	/**
	 * ɾ��һ����¼
	 * @param id
	 * @return ��Ӱ�����
	 */
	int delete(Object id);
	
}
