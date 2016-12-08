package stream04;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 二进制字节流
 */
public class TestDataOutputStream {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("file/test.text"));
		dos.writeUTF("这个牛真的不一般!");
		dos.flush();
		dos.close();
		System.out.println("ok");
	}
}
