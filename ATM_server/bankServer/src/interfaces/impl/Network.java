package interfaces.impl;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import interfaces.IProcessor;
import interfaces.Inetwork;

public class Network implements Inetwork {
	private ServerSocket serSocket = null;
	private Socket socket = null;
	private final int port = 3000;
	private boolean stop = false;
	private Runnable processor = null;

	public Runnable getProcessor() {
		return processor;
	}

	public void setProcessor(Runnable processor) {
		this.processor = processor;
	}

	@Override
	public void start() {
		try {
			serSocket = new ServerSocket(port);
			System.out.println("server start¡­¡­");
			while (!stop) {
				socket = serSocket.accept();
				System.out.println("Accept a socket:"+socket.getRemoteSocketAddress());
//				((IProcessor) processor).setSocket(socket);
				Thread th = new Thread(processor);
				th.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
