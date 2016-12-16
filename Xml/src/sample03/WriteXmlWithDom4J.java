package sample03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class WriteXmlWithDom4J {
	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 24));
		list.add(new Student("李四", 25));
		list.add(new Student("王五", 27));
		
		//创建文档树
		Document doc = DocumentHelper.createDocument();
		//创建根节点
		Element root = doc.addElement("students");
		//创建子节点
		for (Student student : list) {
			root.addElement("student").addAttribute("name", student.getName()).addAttribute("age", String.valueOf(student.getAge()));
			
		}
		//输出到文件
		OutputFormat format = OutputFormat.createPrettyPrint();//漂亮格式
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/dom4j.xml"),format);
		writer.write(doc);
		writer.flush();
		writer.close();
		System.out.println("ok");
		
	}
}
