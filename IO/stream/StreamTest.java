package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		
		//创建文件输入流
		InputStream in=new FileInputStream("test.text");
		
		//读取输入流
		byte[] content=new byte[in.available()];
		in.read(content, 0, content.length);
		
		//关闭流
		in.close();
		
		String str=new String(content);
		System.out.println(str);
		
		
	}
}
