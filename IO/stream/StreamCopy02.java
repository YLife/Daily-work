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
		
		//����Դ�ļ�����
		File src=new File("video/test.wmv");
		
		//����Ŀ���ļ�����
		File dest = new File("file/loop02.wmv");
		
		//����������
		InputStream in =new FileInputStream(src);
		
		//���������
		OutputStream out = new FileOutputStream(dest);
		
		//����
		byte[] buf=new byte[102400];
		int number;
		//�߶���д
		while ((number=in.read(buf, 0, buf.length))!=-1) {
			out.write(buf, 0, number);
		}
		
		//�ر���
		in.close();
		out.close();

		System.out.println("ok");
		
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);
	}
}
