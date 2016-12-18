package tcp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketHelper {
	public static String receive(Socket socket){
		try {
			InputStreamReader reader = new InputStreamReader(socket.getInputStream());
			char[] cbuf = new char[1024];
			StringBuffer sb = new StringBuffer();
			int len = reader.read(cbuf, 0, cbuf.length);
			sb.append(cbuf, 0, len);
			return sb.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static void send(Socket socket,String message){
		try {
			OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
			writer.write(message);
			writer.flush();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
