package sample04;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * ʹ��jdk��׼��ʽ ���л�: object -> xml
 */
public class XmlSerialize {
	public static void main(String[] args) throws Exception {
		// ����JAVA�����е�����
		List<Student> list = new ArrayList<>();
		list.add(new Student("����", 24));
		list.add(new Student("����", 22));
		list.add(new Student("��С��", 13));
		// ���л�Ϊxml
		OutputStream out = new FileOutputStream("src/sample04/students.xml");
		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(list);
		encoder.flush();
		encoder.close();
		System.out.println("ok");
	}
}
