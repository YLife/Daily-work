package com.yl.interfaces.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �˽ӿڹ淶һ�����������������ÿһ����¼ӳ��Ϊһ��ʵ��
 * @author Administrator
 * @param <E>
 *
 */
public interface ResultMapper<E> {
	E resultMapping(ResultSet rs) throws SQLException;
}
