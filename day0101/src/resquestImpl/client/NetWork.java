package resquestImpl.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * ��װ������Ϣ��������Ϣ���ر����ķ���
 * @author YangLun
 *
 */
public class NetWork {
	
	//������Ϣ����󳤶�Ϊ1024
	private  static final int MAX_LENGTH = 1024; 
	
	/**
	 * ������Ϣ
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
	 * ������Ϣ
	 * @param socket
	 * @return
	 */
	public static String receive(Socket socket){
		try {
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] cbuf = new char[MAX_LENGTH];
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
