package Sample;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException, InterruptedException {
		int i=0;
		while (i<100) {
			Socket socket = new Socket("192.168.1.109", 3000);
			String message = "阿军，你妈叫你回家吃饭！";
			SocketHelper.send(socket, message);
			System.out.println("发送成功");
			String reply = SocketHelper.receive(socket);
			System.out.println("收到回复：" + reply);
			i++;
			Thread.sleep(100000);
		}
	}
}
