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
/*
 *使用原生dom创建并保存xml
 */
public class WriteXml {
	public static void main(String[] args) throws Exception {
		// 这是JAVA程序中的数据
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 24));
		list.add(new Student("李四", 22));
		list.add(new Student("李小四", 13));
		// 创建文档树
		DocumentBuilder builder = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element root = doc.createElement("students");
		doc.appendChild(root);
		for (Student student : list) {
			Element stu = doc.createElement("student");
			stu.setAttribute("name", student.getName());
			stu.setAttribute("age", String.valueOf(student.getAge()));
			root.appendChild(stu);
		}
		// 现在要将之保存到xml文件中
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		DOMSource domSource = new DOMSource(doc);
		StreamResult streamResult = new StreamResult(new File(
				"src/students.xml"));
		transformer.transform(domSource, streamResult);
		System.out.println("ok");
	}
}
