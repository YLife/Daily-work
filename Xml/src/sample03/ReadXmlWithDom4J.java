package sample03;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXmlWithDom4J {
	public static void main(String[] args) throws Exception {
		File file = new File("src/dom4j.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		
		Element root = doc.getRootElement();
		List<Element> list = root.elements();
		for (Element element : list) {
			String name = element.attributeValue("name");
			String age = element.attributeValue("age");
			System.out.println(name+", "+age);
		}	
	}
}
