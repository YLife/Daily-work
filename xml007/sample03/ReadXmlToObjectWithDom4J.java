package sample03;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/*
 * 使用dom4j将xml解析成object
 */
public class ReadXmlToObjectWithDom4J {
	public static void main(String[] args) throws Exception {
		File file = new File("src/students.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);

		List<Student> list = new ArrayList<>();
		
		List<Element> elements = doc.getRootElement().elements();
		
		for (Element element : elements) {
			list.add(new Student(element.attributeValue("name"),
					Integer.parseInt(element.attributeValue("age"))));
		}
		
		for (Student student : list) {
			System.out.println(student.getName() + "," + student.getAge());
		}
	}
}
