package web;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������������һ�����̼߳�����
 * @author Administrator
 *
 */
public class BankServer {
	public static final int port = 8080; 
	private ServerSocket serSocket = null;
	Socket socket = null;
	public void start(){
		try {
			System.out.println("��������������");
			serSocket = new ServerSocket(port);
			while (true) {
				socket = serSocket.accept();
				System.out.println("���������յ��ͻ������󡭡�");
				//�����߳�
				Thread th = new Thread(new WebServer(socket));
				th.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
