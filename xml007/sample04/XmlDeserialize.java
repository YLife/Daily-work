package sample04;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.List;

/*
 * 使用jdk标准方式进行反序列化: xml -> object
 */
public class XmlDeserialize {
	public static void main(String[] args) throws Exception {
		XMLDecoder decoder = new XMLDecoder(new FileInputStream("src/sample04/students.xml"));
		List<Student> list = (List<Student>) decoder.readObject();
		for (Student s : list) {
			System.out.println(s.getName() + ", " + s.getAge());
		}
	}
}
