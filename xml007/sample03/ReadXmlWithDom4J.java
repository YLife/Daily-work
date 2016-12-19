package sample03;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * 使用dom4j解析xml
 */
public class ReadXmlWithDom4J {
	public static void main(String[] args) throws Exception {
		File file = new File("src/students.xml");
		SAXReader reader = new SAXReader();
		// 得到文档树
		Document doc = reader.read(file);
		// 根节点
		Element root = doc.getRootElement();
		// 子节点
		List<Element> list = root.elements();
		// 遍历
		for (Element element : list) {
			String name = element.attributeValue("name");
			String age = element.attributeValue("age");
			System.out.println(name + ", " + age);
		}
	}
}
