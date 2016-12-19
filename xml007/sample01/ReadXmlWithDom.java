package sample01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/*
 * 使用原生dom方式解析xml, 得到其中的数据
 */
public class ReadXmlWithDom {
	public static void main(String[] args) throws Exception {
		// 解析器工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 生产解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 解析xml，得到文档对象(DOM树)
		Document doc = builder.parse(new File("src/phone.xml"));
		// 得到名叫"Brand"的元素集合
		NodeList brands = doc.getElementsByTagName("Brand");
		// 遍历
		for (int i = 0; i < brands.getLength(); i++) {
			// 得到Brand元素
			Element brand = (Element)brands.item(i);
			// 得到Brand元素的name属性值
			String name = brand.getAttribute("name");
			System.out.println(name);
			// 得到Brand元素下一级中的Type元素的集合
			NodeList types = brand.getElementsByTagName("Type");
			// 遍历Type元素集合
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element)types.item(j);
				// 得到Type元素的name属性值
				System.out.println("\t" + type.getAttribute("name"));
			}
		}
	}
}
