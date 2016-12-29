package requestImpl;

import java.net.Socket;
import java.text.MessageFormat;

import request.BankRequest;

public class BankRequestImpl implements BankRequest {
	
	private static final String host = "127.0.0.1";
	private static final int port = 8000;
	private Socket socket = null;

	@Override
	public boolean findAccount(String cardId) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("findAccount {0}", cardId);
			NetWork.send(socket, message);
			boolean reply = Boolean.parseBoolean(NetWork.receive(socket));
			return reply;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			NetWork.close(socket);
		}
		return false;
	}

	@Override
	public boolean checkAccount(String cardId, String pwd) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("checkAccount {0} {1}", cardId,pwd);
			NetWork.send(socket, message);
			boolean reply = Boolean.parseBoolean(NetWork.receive(socket));
			return reply;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public double getBalance(String cardId) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("getBalance {0}", cardId);
			NetWork.send(socket, message);
			double balance = Double.parseDouble(NetWork.receive(socket));
			return balance;
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		return 0;
	}

	@Override
	public boolean deposit(String cardId, double money) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("deposit {0} {1}", cardId , money);
			NetWork.send(socket, message);
			boolean reply = Boolean.parseBoolean(NetWork.receive(socket));
			return reply;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			NetWork.close(socket);
		}
		return false;
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("withDraw {0} {1}", cardId , money);
			NetWork.send(socket, message);
			boolean reply = Boolean.parseBoolean(NetWork.receive(socket));
			return reply;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			NetWork.close(socket);
		}
		return false;
	}

	@Override
	public boolean trans(String outCardId, String inCardId, double money) {
		try {
			socket = new Socket(host, port);
			String message = MessageFormat.format("trans {0} {1} {2}", outCardId , inCardId , money);
			NetWork.send(socket, message);
			boolean reply = Boolean.parseBoolean(NetWork.receive(socket));
			return reply;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			NetWork.close(socket);
		}
		return false;
	}

}
