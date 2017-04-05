package client;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			//客户端向服务器发起请求
			Socket socket = new Socket("127.0.0.1", 6001);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			writer.write("客户端向服务器发起请求");
			writer.flush();
			System.out.println("发送完毕！");
			//服务器向客户端进行响应
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] buf = new char[1024];
			StringBuffer sb = new StringBuffer();
			int len = 0;
			len = reader.read(buf, 0, buf.length);
			sb.append(buf, 0, len);
			/*while ((len = reader.read(buf, len, buf.length)) != -1) {
				sb.append(buf, 0, len);
			}*/
			System.out.println("接受到服务器响应：" + sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
