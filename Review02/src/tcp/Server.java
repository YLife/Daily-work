package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serSocket = new ServerSocket(3000);
		Socket socket = serSocket.accept();
		String str = SocketHelper.receive(socket);
		System.out.println("�յ�����"+str);
		
		String reply = "�ɹ��յ������Ѵ���";
		SocketHelper.send(socket, reply);
		System.out.println("�ظ�ok!");
	}
}
