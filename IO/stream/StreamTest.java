package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		
		//�����ļ�������
		InputStream in=new FileInputStream("test.text");
		
		//��ȡ������
		byte[] content=new byte[in.available()];
		in.read(content, 0, content.length);
		
		//�ر���
		in.close();
		
		String str=new String(content);
		System.out.println(str);
		
		
	}
}
