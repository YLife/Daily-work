package interfaces.impl;

import models.Command;
import interfaces.IProcessor;


public class Processor implements IProcessor,Runnable {
	private CommandBuilder cmBuilder = null;
	@Override
	public void run() {
		String str = this.receive();
		System.out.println("receive£º"+str);
		Command cmd = cmBuilder.parse(str);
	}

	@Override
	public String receive() {
		
		return null;
	}

	@Override
	public void send(String message) {
		
	}

}
