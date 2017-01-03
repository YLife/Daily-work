package config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import biz.BankBiz;
import dao.CardInfoDao;
import dao.TradeInfoDao;

public class ApplicationContext {
	// 配置信息
	public static Map<String, String> config = new HashMap<String, String>();

	// 读取配置信息
	static {
		// tomcat根目录
		String catalina_base = System.getProperty("catalina.base");
		// 配置文件applicationContext.xml的目录
		String path = catalina_base + "/webapps/bank-web/WEB-INF/classes/applicationContext.xml";
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(path);
			Element root = doc.getRootElement();
			for (Element e : (List<Element>) root.elements()) {
				config.put(e.attributeValue("id"), e.attributeValue("impl"));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	// 以下方法使用反射技术动态创建接口实例
	
	public static BankBiz getBankBiz(){
		String className = config.get("bankBiz");
		try {
			Object obj = Class.forName(className).newInstance();
			return (BankBiz)obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static CardInfoDao getCardInfoDao() {
		String className = config.get("cardInfoDao");
		try {
			Object obj = Class.forName(className).newInstance();
			return (CardInfoDao)obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static TradeInfoDao getTradeInfoDao() {
		String className = config.get("tradeInfoDao");
		try {
			Object obj = Class.forName(className).newInstance();
			return (TradeInfoDao)obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
