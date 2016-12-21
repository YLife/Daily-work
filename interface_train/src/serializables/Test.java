package serializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		Student stu = new Student("小明", 12);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files/tecent.txt"));
		out.writeObject(stu);
		out.flush();
		out.close();
		System.out.println("写入成功！");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("files/tecent.txt"));
		Student stu1 = (Student) in.readObject();
		in.close();
		System.out.println(stu1.getName()+" , "+stu1.getAge());

	}
}
