package stream03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		//创建字符流
		FileReader reader=new FileReader("file/test.text");
		//包装一个更为有效的BufferedReader 
		BufferedReader bufReader=new BufferedReader(reader);
		//读
		String line;
		StringBuffer sb=new StringBuffer();
		while ((line=bufReader.readLine())!=null) {
			sb.append(line+"\n");
		}
		
		//关闭流
		reader.close();
		
		System.out.println(sb);
	}
}
