package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class client {
	public static void main(String[] args) throws Exception {
		String str = "周末，你好！";
		byte[] cbuf = str.getBytes();
		//只负责把消息发送出去
		DatagramSocket socket = new DatagramSocket();
		//packet封装了所有的信息
		DatagramPacket packet = new DatagramPacket(cbuf, 0, cbuf.length,InetAddress.getByName("localhost"),3000);
		socket.send(packet);
		System.out.println("send ok!");
		
		cbuf = new byte[1024];
		packet = new DatagramPacket(cbuf, cbuf.length);
		socket.receive(packet);
		System.out.println("收到回复:"+new String(cbuf, 0, packet.getLength()));
	}
}
