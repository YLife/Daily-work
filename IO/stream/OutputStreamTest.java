package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		String str="����������⣡��Ҫ��ҽ����";
		byte[] content=str.getBytes();
		//�����ļ����������
		OutputStream out=new FileOutputStream("file/test.text");
		
		//����ֽ�
		out.write(content,0,content.length);
		
		//�ر���
		out.close();
	}
}
