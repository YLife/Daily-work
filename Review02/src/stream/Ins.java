package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ins {
	public static void main(String[] args) throws Exception {
		// 创建文件输入流
		InputStream in = new FileInputStream("file/tecent.txt");
		// 读取字节
		byte[] content = new byte[in.available()]; // available指的是流的长度
		in.read(content, 0, content.length);
		// 关闭输入流
		in.close();

		String str = new String(content);
		System.out.println(str);
	}
}

