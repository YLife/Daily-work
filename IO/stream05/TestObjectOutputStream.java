package stream05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * �������л�
 */
public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		// ����һ������
		Student stu = new Student("����", 20);
		// �������������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"
				+ "/test.text"));
		// ���������������ļ���
		oos.writeObject(stu);
		oos.flush();
		oos.close();
		System.out.println("ok");
	}
}
