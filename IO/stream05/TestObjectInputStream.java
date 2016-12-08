package stream05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * �������л�
 */
public class TestObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ����������
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file/test.text"));
		// ��
		Student stu = (Student)ois.readObject();
		// �ر���
		ois.close();
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}
}
