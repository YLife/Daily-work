package sample03;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
/*
 * ʹ��dom4j���ɲ�����xml
 */
public class WriteXmlWithDom4J {
	public static void main(String[] args) throws Exception {
		// ����JAVA�����е�����
		List<Student> list = new ArrayList<>();
		list.add(new Student("����", 24));
		list.add(new Student("����", 22));
		list.add(new Student("��С��", 13));

		// �����ĵ���
		Document doc = DocumentHelper.createDocument();
		// �������ڵ�
		Element root = doc.addElement("students");
		// �����ӽڵ�
		for (Student stu : list) {
			root.addElement("student").addAttribute("name", stu.getName())
					.addAttribute("age", String.valueOf(stu.getAge()));

		}
		// ������ļ�
		OutputFormat fmt = OutputFormat.createPrettyPrint(); // Ư����ʽ
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/xxx.xml"), fmt);
		writer.write(doc);
		writer.flush();
		writer.close();
		System.out.println("ok");
	}
}
