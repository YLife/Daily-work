package com.yl.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yl.entity.ContactBook;

/**
 * �����ݿ���Դ����ץȡ���ͷŲ���
 * @author Administrator
 *
 */
public class BaseDao {
	//��������
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return Connection
	 */
	public Connection getConnection(){
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactbook?user=root&password=YL635901");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public void colse(ResultSet rs , Statement stmt , Connection conn){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ִ�в�ѯ����
	 * @param sql
	 * @param params
	 * @return ��ϵ�˼���
	 */
	public List<ContactBook> excuteQuery(String sql , Object... params){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			rs = stmt.executeQuery();
			List<ContactBook> list = new ArrayList<ContactBook>();
			while (rs.next()) {
				ContactBook entity = new ContactBook(rs.getInt("contactId"), rs.getString("contactName"), rs.getString("contactPhone"), rs.getString("contactMail"), rs.getString("relation"));
				list.add(entity);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.colse(rs, stmt, conn);
		}
		return null;
	}
	
	/**
	 * ִ����ɾ�Ĳ���
	 * @param sql
	 * @param params
	 * @return ��Ӱ�����
	 */
	public int excuteUpdate(String sql , Object... params){
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.colse(null , stmt , conn);
		}
		return 0;
	}
}
