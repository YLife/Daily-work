package stream02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		//�����ַ���
		FileReader reader=new FileReader("file/test.text");
		//��
		char[] buf=new char[102400];//����
		int number;
		StringBuffer sb=new StringBuffer();
		while ((number=reader.read(buf, 0, buf.length))!=-1) {
			sb.append(buf, 0, number);
		}
		
		//�ر���
		reader.close();
		
		System.out.println(sb);
	}
}
