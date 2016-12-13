package day1213;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.1.102", 3000);
		String message = "Good morning !";
		SocketHelper.send(socket, message);
		System.out.println("发送完毕 ！");
		
		String reply= SocketHelper.receive(socket);
		System.out.println("收到回复："+reply);
		
	}
}
