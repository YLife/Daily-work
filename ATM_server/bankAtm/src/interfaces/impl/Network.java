package interfaces.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import interfaces.Inetwork;

public class Network implements Inetwork {

	private Socket socket = null;
	final String host = "192.168.1.108";
	final int port = 3000;
	
	public Socket getSocket() {
		return socket;
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void send(String commandStr) {
		try {
			socket = new Socket(host, port);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter write = new OutputStreamWriter(out);
			write.write(commandStr);
			write.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String receive() {
		try {
			StringBuffer sb = new StringBuffer();
			socket=this.getSocket();
			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			char[] buf = new char[1024];
			int len = reader.read(buf, 0, buf.length);
			sb.append(buf, 0, len);
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
