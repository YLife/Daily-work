package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ins {
	public static void main(String[] args) throws Exception {
		// �����ļ�������
		InputStream in = new FileInputStream("file/tecent.txt");
		// ��ȡ�ֽ�
		byte[] content = new byte[in.available()]; // availableָ�������ĳ���
		in.read(content, 0, content.length);
		// �ر�������
		in.close();

		String str = new String(content);
		System.out.println(str);
	}
}

