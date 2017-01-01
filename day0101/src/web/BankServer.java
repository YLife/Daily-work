package web;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开启服务器，创建一个多线程监听器
 * @author Administrator
 *
 */
public class BankServer {
	public static final int port = 8080; 
	private ServerSocket serSocket = null;
	Socket socket = null;
	public void start(){
		try {
			System.out.println("服务器开启……");
			serSocket = new ServerSocket(port);
			while (true) {
				socket = serSocket.accept();
				System.out.println("服务器接收到客户端请求……");
				//开启线程
				Thread th = new Thread(new WebServer(socket));
				th.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
