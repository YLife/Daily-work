package stream02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("file/test.text");
		
		writer.write("��ã��Ұ��㣡");
		writer.flush();
		writer.close();
		
		System.out.println("ok");
	}
}
