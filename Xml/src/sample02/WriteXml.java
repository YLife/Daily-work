package sample02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class WriteXml {
	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 22));
		list.add(new Student("李四",25));
		list.add(new Student("王五", 26));
		
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.newDocument();
		Element root = doc.createElement("students");
		doc.appendChild(root);
		
		for (Student student : list) {
			Element stu = doc.createElement("student");
			stu.setAttribute("name",student.getName());
			stu.setAttribute("age", String.valueOf(student.getAge()));
			root.appendChild(stu);
		}
		
		//现在将文档树保存到xml
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		DOMSource domSource = new DOMSource(doc);
		StreamResult streamResult = new StreamResult(new File("src/students.xml"));
		transformer.transform(domSource, streamResult);
		System.out.println("OK");
		
	}
}
