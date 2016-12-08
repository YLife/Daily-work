package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTEST {
	public static void main(String[] args) throws IOException {
		// 创建字节流
		OutputStream out = new FileOutputStream("file/test.text");
		// 包装为字符流
		Writer writer = new OutputStreamWriter(out);
		// 写
		writer.write("这个投影仪好像是歪的!快去扳正!");
		writer.flush();
		// 关闭流
		writer.close();
		System.out.println("ok");
	}
}
