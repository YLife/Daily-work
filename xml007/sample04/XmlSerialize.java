package sample04;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 使用jdk标准方式 序列化: object -> xml
 */
public class XmlSerialize {
	public static void main(String[] args) throws Exception {
		// 这是JAVA程序中的数据
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 24));
		list.add(new Student("李四", 22));
		list.add(new Student("李小四", 13));
		// 序列化为xml
		OutputStream out = new FileOutputStream("src/sample04/students.xml");
		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(list);
		encoder.flush();
		encoder.close();
		System.out.println("ok");
	}
}
