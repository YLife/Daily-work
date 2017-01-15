package com.yl.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.yl.dao.impl.EmpDaoImpl;

public class ApplicationConfig {
	private static Map<String, String> config = new HashMap<String, String>();
	
	//读取配置文件信息
	static{
		SAXReader reader = new SAXReader();
		try {
			//获取tomcat根目录
			String catalina_base = System.getProperty("catalina.base");
			String path = catalina_base + "/webapps/day0114/WEB-INF/classes/ApplicationConfig.xml";
			Document doc = reader.read(path);
			Element root = doc.getRootElement();
			@SuppressWarnings("unchecked")
			List<Element> list  = root.elements();
			for (Element element : list) {
				config.put(element.attributeValue("id"), element.attributeValue("impl"));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过反射技术得到类的实例
	 * @return EmpDaoImpl对象
	 */
	public static EmpDaoImpl getInstance(){
		String className = config.get("EmpDaoImpl");
		try {
			Object obj = Class.forName(className).newInstance();
			return (EmpDaoImpl)obj;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
