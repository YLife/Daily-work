package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server {
	public static void main(String[] args) throws Exception {
		byte[] cbuf = new byte[1024];
		DatagramSocket socket = new DatagramSocket(3000);
		DatagramPacket packet = new DatagramPacket(cbuf, 0, cbuf.length);
		socket.receive(packet);
		System.out.println(" ’µΩ«Î«Û"+new String(cbuf, 0, packet.getLength()));
		
		String str = "hello! good afternoon!";
		cbuf = str.getBytes();
		packet = new DatagramPacket(cbuf, 0, cbuf.length,packet.getSocketAddress());
		socket.send(packet);
		System.out.println("send ok!");
	}
}
