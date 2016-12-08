package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopy02 {
	public static void main(String[] args) throws IOException {
		
		long start=System.currentTimeMillis();
		
		//创建源文件对象
		File src=new File("video/test.wmv");
		
		//创建目标文件对象
		File dest = new File("file/loop02.wmv");
		
		//创建输入流
		InputStream in =new FileInputStream(src);
		
		//创建输出流
		OutputStream out = new FileOutputStream(dest);
		
		//缓存
		byte[] buf=new byte[102400];
		int number;
		//边读边写
		while ((number=in.read(buf, 0, buf.length))!=-1) {
			out.write(buf, 0, number);
		}
		
		//关闭流
		in.close();
		out.close();

		System.out.println("ok");
		
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);
	}
}
