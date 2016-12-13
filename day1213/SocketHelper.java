package day1213;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketHelper {
	public static void send(Socket socket,String message){
		try {
			OutputStream os= socket.getOutputStream();
			OutputStreamWriter write = new OutputStreamWriter(os);
			//�������ﲻ�ر��������ᵼ��һֱ��ȡ���꣬�����������������ַ���Ϊ��1024
			write.write(message);
			write.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String receive(Socket socket){
		try {
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] buf=new char[1024];
			StringBuffer sb = new StringBuffer();
			int len=reader.read(buf, 0, buf.length);
			sb.append(buf, 0, len);
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
