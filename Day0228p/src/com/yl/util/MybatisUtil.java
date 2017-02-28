package com.yl.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * π§æﬂ¿‡
 * @author Mr.Yang
 *
 */
public class MybatisUtil {
	private static SqlSessionFactory factory = null;
	private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();
	
	static {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		SqlSession session = local.get();
		if (session == null) {
			session = factory.openSession();
			local.set(session);
		}
		return session;
	}
	
	public static void close(){
		SqlSession session = local.get();
		if (session != null) {
			session.close();
		}
	}
}
