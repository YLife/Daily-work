package tcp;


import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("192.168.0.127", 3000);	
		String message = "���Ǵ�ɵ�ƣ�";
		SocketHelper.send(socket, message);
		System.out.println("���ͳɹ���");
		
		String str = SocketHelper.receive(socket);
		System.out.println("�յ��ظ���"+str);
	}
	
	
}
