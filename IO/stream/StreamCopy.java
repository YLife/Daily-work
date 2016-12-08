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
		
		//����Դ�ļ�����
		File src=new File("video/test.wmv");
		
		//����Ŀ���ļ�����
		File dest=new File("file/loop.wmv");
		
		//����������,����ȡ�ֽ�
		InputStream in=new FileInputStream(src);
		byte[] content=new byte[in.available()];
		in.read(content, 0, content.length);
		in.close();
		System.out.println("��ȡ���");
		
		//�������������д��
		OutputStream out =new FileOutputStream(dest);
		out.write(content, 0, content.length);
		out.flush();
		out.close();
		System.out.println("д�����");
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-begin+"����");
		
	}
}
