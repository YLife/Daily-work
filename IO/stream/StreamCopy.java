package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopy {
	public static void main(String[] args) throws IOException {
		
		long begin = System.currentTimeMillis();
		
		//创建源文件对象
		File src=new File("video/test.wmv");
		
		//创建目标文件对象
		File dest=new File("file/loop.wmv");
		
		//创建输入流,并读取字节
		InputStream in=new FileInputStream(src);
		byte[] content=new byte[in.available()];
		in.read(content, 0, content.length);
		in.close();
		System.out.println("读取完毕");
		
		//创建输出流，并写入
		OutputStream out =new FileOutputStream(dest);
		out.write(content, 0, content.length);
		out.flush();
		out.close();
		System.out.println("写入完毕");
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-begin+"毫秒");
		
	}
}
