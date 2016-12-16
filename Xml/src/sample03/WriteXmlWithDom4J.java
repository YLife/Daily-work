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
		list.add(new Student("����", 24));
		list.add(new Student("����", 25));
		list.add(new Student("����", 27));
		
		//�����ĵ���
		Document doc = DocumentHelper.createDocument();
		//�������ڵ�
		Element root = doc.addElement("students");
		//�����ӽڵ�
		for (Student student : list) {
			root.addElement("student").addAttribute("name", student.getName()).addAttribute("age", String.valueOf(student.getAge()));
			
		}
		//������ļ�
		OutputFormat format = OutputFormat.createPrettyPrint();//Ư����ʽ
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/dom4j.xml"),format);
		writer.write(doc);
		writer.flush();
		writer.close();
		System.out.println("ok");
		
	}
}
