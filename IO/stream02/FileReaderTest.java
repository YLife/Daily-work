package stream02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		//创建字符流
		FileReader reader=new FileReader("file/test.text");
		//读
		char[] buf=new char[102400];//缓存
		int number;
		StringBuffer sb=new StringBuffer();
		while ((number=reader.read(buf, 0, buf.length))!=-1) {
			sb.append(buf, 0, number);
		}
		
		//关闭流
		reader.close();
		
		System.out.println(sb);
	}
}
