package stream04;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �������ֽ���
 */
public class TestDataOutputStream {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("file/test.text"));
		dos.writeUTF("���ţ��Ĳ�һ��!");
		dos.flush();
		dos.close();
		System.out.println("ok");
	}
}
