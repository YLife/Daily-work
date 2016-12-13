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
		
		//这个socket负责把packet发送出去
		socket = new DatagramSocket();
		byte[] buf = "hello!".getBytes();
		//这个packet封装了所有信息
		packet = new DatagramPacket(buf, 0, address, port);
		//发送出去
		socket.send(packet);
		System.out.println("发送成功！");
		
		//收回复
		buf = new byte[1024];
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println("收到回复:"+new String(buf,0,buf.length));
	}
}
