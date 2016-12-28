package config;

import interfaces.CardInfoDao;
import interfaces.TradeInfoDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import biz.BankBiz;


public class ApplicationContext {
	//配置信息
	public static Map<String, String> config = new HashMap<>();
	
	//读取配置信息
	static{
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read("src/applicationContext.xml");
			Element root = doc.getRootElement();
			List<Element> list = root.elements();
			for (Element e : list) {
				config.put(e.attributeValue("id"), e.attributeValue("impl"));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	//以下方法通过反射技术动态创建接口实例
	
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
	
	public static CardInfoDao getCardInfoDao(){
		String className = config.get("cardInfoDao");
		try {
			Object obj = Class.forName(className).newInstance();
			return (CardInfoDao)obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static TradeInfoDao getTradeInfoDao(){
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
