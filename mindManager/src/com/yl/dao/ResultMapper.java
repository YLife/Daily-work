package com.yl.dao;

import java.sql.ResultSet;
/**
 * �˽ӿڹ淶һ����������������е�һ�м�¼ӳ��Ϊһ��ʵ��
 * @author Administrator
 *
 * @param <E>
 */
public interface ResultMapper<E> {
	/**
	 * ��������е�һ�м�¼ӳ��Ϊһ��ʵ��
	 * @param rs
	 * @return E
	 */
	E resultMapping(ResultSet rs);
}
