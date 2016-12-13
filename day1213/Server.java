package day1213;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket seSocket = new ServerSocket(3000);
		Socket socket = seSocket.accept();
		String message = SocketHelper.receive(socket);
		System.out.println("收到："+message);
		
		SocketHelper.send(socket, message);
		System.out.println("回复完毕 ！");
	}
}
