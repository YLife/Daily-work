package stream03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		//�����ַ���
		FileReader reader=new FileReader("file/test.text");
		//��װһ����Ϊ��Ч��BufferedReader 
		BufferedReader bufReader=new BufferedReader(reader);
		//��
		String line;
		StringBuffer sb=new StringBuffer();
		while ((line=bufReader.readLine())!=null) {
			sb.append(line+"\n");
		}
		
		//�ر���
		reader.close();
		
		System.out.println(sb);
	}
}
