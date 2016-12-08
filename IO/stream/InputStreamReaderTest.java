package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) throws IOException {
		// 创建字节流
		InputStream in = new FileInputStream("file/test.text");
		// 将字节流包装为字符流
		InputStreamReader reader = new InputStreamReader(in);
		// 读文件
		char[] buf = new char[1024];
		int number;
		StringBuffer sb = new StringBuffer();
		while ((number = reader.read(buf, 0, buf.length)) != -1) {
			sb.append(buf, 0, number);
		}
		// 关闭流
		reader.close();
		in.close();
		System.out.println("ok");
		System.out.println(sb);
		
	}
}
