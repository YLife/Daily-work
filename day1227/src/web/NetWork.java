package web;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * ʵ�ֿͻ����������ͨѶ
 * @author Administrator
 *
 */
public class NetWork {
	private static final int MAX_LENGTH = 1024 ;
	
	/**
	 * ��������
	 * @param socket
	 * @param message
	 */
	public static void send(Socket socket , String message){
		try {
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			writer.write(message);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �յ��ظ�
	 * @param socket
	 * @return
	 */
	public static String receive(Socket socket){
		try {
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] cbuf = new char[1024];
			int len = reader.read(cbuf, 0, MAX_LENGTH);
			return new String(cbuf, 0, len);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * �ر���
	 * @param socket
	 */
	public static void close(Socket socket){
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
