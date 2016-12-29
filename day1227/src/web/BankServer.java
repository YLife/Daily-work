package web;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BankServer {
	private static final int port = 8000;
	private ServerSocket serSocket = null;
	
	public void start(){
		try {
			System.out.println("�������Կ�������");
			serSocket = new ServerSocket(port);
			while (true) {
				Socket socket = serSocket.accept();
				System.out.println("���ܵ��ͻ������󡭡�");
				//�����߳�
				Thread th = new Thread(new WebServer(socket));
				th.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
