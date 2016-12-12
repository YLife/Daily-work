package sever;

import java.io.OutputStreamWriter;
import java.net.Socket;


public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("192.168.1.100",3000);
		OutputStreamWriter out=new OutputStreamWriter(socket.getOutputStream());
		out.write("That is sounds good !");
		out.flush();
		socket.close();
	}
}
