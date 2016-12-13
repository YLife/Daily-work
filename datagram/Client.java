package datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		
		InetAddress address = InetAddress.getByName("localhost");
		int port = 3000;
		
		//���socket�����packet���ͳ�ȥ
		socket = new DatagramSocket();
		byte[] buf = "hello!".getBytes();
		//���packet��װ��������Ϣ
		packet = new DatagramPacket(buf, 0, address, port);
		//���ͳ�ȥ
		socket.send(packet);
		System.out.println("���ͳɹ���");
		
		//�ջظ�
		buf = new byte[1024];
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println("�յ��ظ�:"+new String(buf,0,buf.length));
	}
}
