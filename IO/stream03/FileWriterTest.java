package stream03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("file/test.text");
		BufferedWriter bufWriter=new BufferedWriter(writer);
		
		bufWriter.write("���ͶӰ�Ǻ��������!��ȥ����!��������û��?");
		bufWriter.flush();
		bufWriter.close();
		writer.close();
		
		System.out.println("ok");
	}
}
