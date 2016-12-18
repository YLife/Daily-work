package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serSocket = new ServerSocket(3000);
		Socket socket = serSocket.accept();
		String str = SocketHelper.receive(socket);
		System.out.println("收到请求："+str);
		
		String reply = "成功收到请求，已处理！";
		SocketHelper.send(socket, reply);
		System.out.println("回复ok!");
	}
}
