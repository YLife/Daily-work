package com.yl.dao;

import java.sql.ResultSet;

/**
 * ��������е�һ�м�¼ӳ��Ϊһ��ʵ��
 * @author Administrator
 * @param <E>
 *
 */
public interface ResultMapper<E> {
	E resultMapping(ResultSet rs);
}
