package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		String str="这个人有问题！需要看医生！";
		byte[] content=str.getBytes();
		//创建文件输出流对象
		OutputStream out=new FileOutputStream("file/test.text");
		
		//输出字节
		out.write(content,0,content.length);
		
		//关闭流
		out.close();
	}
}
