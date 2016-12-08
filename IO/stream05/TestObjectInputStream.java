package stream05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 对象反序列化
 */
public class TestObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 对象输入流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file/test.text"));
		// 读
		Student stu = (Student)ois.readObject();
		// 关闭流
		ois.close();
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}
}
