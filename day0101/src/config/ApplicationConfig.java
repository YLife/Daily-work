package config;

import interfaces.Dao.CardInfoDao;
import interfaces.Dao.TradeInfoDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import biz.BankBiz;

/**
 * ���������ļ���Ϣ����ͨ�����似����̬�õ����ʵ��
 * @author YangLun
 *
 */
public class ApplicationConfig {
	//�����ļ���Ϣ
	private static Map<String, String> config = new HashMap<String, String>();
	
	//��ȡ�����ļ���Ϣ
	static{
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read("src/ApplicationConfig.xml");
			Element root = doc.getRootElement();
			List<Element> list = root.elements();
			for (Element element : list) {
				config.put(element.attributeValue("id"), element.attributeValue("impl"));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	//���·���ͨ�����似����̬�õ����ʵ��
	
	public static BankBiz getBankBiz(){
		String className = config.get("bankBiz");
		try {
			Object obj = Class.forName(className).newInstance();
			return (BankBiz) obj;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static CardInfoDao getCardInfoDao(){
		String className = config.get("cardInfoDao");
		try {
			Object obj = Class.forName(className).newInstance();
			return (CardInfoDao) obj;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static TradeInfoDao getTradeInfoDao(){
		String className = config.get("tradeInfoDao");
		try {
			Object obj = Class.forName(className).newInstance();
			return (TradeInfoDao) obj;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
