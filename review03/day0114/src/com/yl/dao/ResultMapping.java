package com.yl.dao;

import java.sql.ResultSet;

/**
 * ��������е�ÿһ����¼ӳ��Ϊһ������
 * @author Administrator
 * @param <E>
 *
 */

public interface ResultMapping<E> {
	public E resultMapping(ResultSet rs);
}
