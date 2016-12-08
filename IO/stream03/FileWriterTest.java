package stream03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("file/test.text");
		BufferedWriter bufWriter=new BufferedWriter(writer);
		
		bufWriter.write("这个投影仪好像是歪的!快去扳正!看看正了没有?");
		bufWriter.flush();
		bufWriter.close();
		writer.close();
		
		System.out.println("ok");
	}
}
