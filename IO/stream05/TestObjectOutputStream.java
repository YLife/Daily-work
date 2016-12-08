package stream05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 对象序列化
 */
public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		// 这是一个对象
		Student stu = new Student("张三", 20);
		// 创建对象输出流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"
				+ "/test.text"));
		// 将这个对象输出到文件中
		oos.writeObject(stu);
		oos.flush();
		oos.close();
		System.out.println("ok");
	}
}
