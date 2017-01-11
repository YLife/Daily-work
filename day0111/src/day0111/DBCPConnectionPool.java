package day0111;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;



public class DBCPConnectionPool {
	private static DataSource dataSource = null;

	public static Connection getConnection() throws Exception {
		if(dataSource==null){
			Properties properties = new Properties();
			InputStream in = null;
			try {
				in = new FileInputStream("src/dbcp-config.properties");
				/*in = DBCPConnectionPool.class.getResourceAsStream("/dbcp-config.properties");*/
				properties.load(in);
				System.out.println(properties);
			} catch (Exception e) {
				throw e;
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
					}
				}
			}
			dataSource = BasicDataSourceFactory.createDataSource(properties);
		}
		Connection conn = dataSource.getConnection();
		return conn;
	}

	 
	public static void main(String[] args) throws Exception {
		Connection c = DBCPConnectionPool.getConnection();
		System.out.println(c);
	}
}
