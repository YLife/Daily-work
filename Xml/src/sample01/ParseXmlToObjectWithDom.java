package sample01;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ParseXmlToObjectWithDom {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse("src/phone.xml");
		NodeList brands = doc.getElementsByTagName("Brand");
		List<Brand> result = new ArrayList<>();
		
		for (int i = 0; i < brands.getLength(); i++) {
			Element brand = (Element) brands.item(i);
			String name = brand.getAttribute("name");
			//封装成对象
			Brand brandObj = new Brand(name);
			result.add(brandObj);
			NodeList types = brand.getElementsByTagName("Type");
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element) types.item(j);
				String typeName = type.getAttribute("name");
				brandObj.getType().add(new Type(typeName));
			}
		}
		for (Brand brand : result) {
			System.out.println(brand.getName());
			for (Type type : brand.getType()) {
				System.out.println("\t"+type.getName());
			}
		}
	}
}
