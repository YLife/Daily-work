package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class client {
	public static void main(String[] args) throws Exception {
		String str = "��ĩ����ã�";
		byte[] cbuf = str.getBytes();
		//ֻ�������Ϣ���ͳ�ȥ
		DatagramSocket socket = new DatagramSocket();
		//packet��װ�����е���Ϣ
		DatagramPacket packet = new DatagramPacket(cbuf, 0, cbuf.length,InetAddress.getByName("localhost"),3000);
		socket.send(packet);
		System.out.println("send ok!");
		
		cbuf = new byte[1024];
		packet = new DatagramPacket(cbuf, cbuf.length);
		socket.receive(packet);
		System.out.println("�յ��ظ�:"+new String(cbuf, 0, packet.getLength()));
	}
}
