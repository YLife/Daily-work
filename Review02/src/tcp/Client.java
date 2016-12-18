package tcp;


import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("192.168.0.127", 3000);	
		String message = "你是大傻逼！";
		SocketHelper.send(socket, message);
		System.out.println("发送成功！");
		
		String str = SocketHelper.receive(socket);
		System.out.println("收到回复！"+str);
	}
	
	
}
