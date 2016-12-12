package sever;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws Exception {
		int port= 3000;
		ServerSocket serSocketed=new ServerSocket(port);
		
		Socket socket=serSocketed.accept();
		InputStream in=socket.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		
		
		char[] buf=new char[1024];
		StringBuffer sb= new StringBuffer();
		int len;
		while ((len=reader.read(buf, 0,buf.length))!=-1) {
			sb.append(buf,0,len);
		}
		System.out.println("服务器收到消息:"+sb);
	
	}
}
