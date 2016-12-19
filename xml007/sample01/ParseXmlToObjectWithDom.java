package sample01;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/*
 * 使用原生dom方式将xml解析为object
 */
public class ParseXmlToObjectWithDom {
	public static void main(String[] args) throws Exception {
		// 解析器工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 生产解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 解析xml，得到文档对象(DOM树)
		Document doc = builder.parse("http://localhost/data/%E5%8D%8E%E4%B8%BA%E9%AB%98%E7%A7%9115%E7%8F%AD/java/XML/phone.xml");
		// 得到名叫"Brand"的元素集合
		NodeList brands = doc.getElementsByTagName("Brand");
		
		List<Brand> result = new ArrayList<>();
		
		// 遍历
		for (int i = 0; i < brands.getLength(); i++) {
			// 得到Brand元素
			Element brand = (Element)brands.item(i);
			// 得到Brand元素的name属性值
			String name = brand.getAttribute("name");
			// 封装成对象
			Brand brandObj = new Brand(name);
			result.add(brandObj);
			// 得到Brand元素下一级中的Type元素的集合
			NodeList types = brand.getElementsByTagName("Type");
			// 遍历Type元素集合
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element)types.item(j);
				// 得到Type元素的name属性值
				String typeName = type.getAttribute("name");
				brandObj.getTypes().add(new Type(typeName));
			}
		}
		// 输出
		for (Brand b : result) {
			System.out.println(b.getName());
			for (Type t : b.getTypes()) {
				System.out.println("\t" + t.getName());
			}
		}
	}
}
