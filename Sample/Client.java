package Sample;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException, InterruptedException {
		int i=0;
		while (i<100) {
			Socket socket = new Socket("192.168.1.109", 3000);
			String message = "�������������ؼҳԷ���";
			SocketHelper.send(socket, message);
			System.out.println("���ͳɹ�");
			String reply = SocketHelper.receive(socket);
			System.out.println("�յ��ظ���" + reply);
			i++;
			Thread.sleep(100000);
		}
	}
}
