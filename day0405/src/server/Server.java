package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6001);
			System.out.println("服务器开启.....");
			Socket socket = ss.accept();
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] buf = new char[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			len = reader.read(buf, 0, buf.length);
			sb.append(buf, 0, len);
			/*while ((len = reader.read(buf, 0, buf.length)) != -1) {
				sb.append(buf, 0, len);
			}*/
			System.out.println("接受到客户端请求：" + sb.toString());
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			writer.write("向客户端进行响应");
			writer.flush();
			System.out.println("回复完毕！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
