package resquestImpl.client;

import java.io.IOException;
import java.net.Socket;
import java.text.MessageFormat;

import resquest.client.ClientResquest;

public class ClientResquestImpl implements ClientResquest {
	
	private static final String host = "127.0.0.1";
	private static final int port = 8080; 
	private String message = null;
	private Socket socket = null;
	
	/**
	 * 将发送和接受消息用方法封装起来
	 * @return
	 */
	public String method(){
		try {
			socket = new Socket(host, port);
			NetWork.send(socket, message);
			message = NetWork.receive(socket);
			return message;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String findAccount(String cardId) {
		try {
			message = MessageFormat.format("findAccount {0}", cardId);
			return this.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String checkAccount(String cardId, String pwd) {
		message = MessageFormat.format("checkAccount {0} {1}", cardId , pwd);
		return this.method();
	}

	@Override
	public double getBalance(String cardId) {
		message = MessageFormat.format("getBalance {0}", cardId);
		return Double.parseDouble(this.method());
	}

	@Override
	public String deposit(String cardId, double money) {
		message = MessageFormat.format("deposit {0} {1}" , cardId , money );
		return this.method();
	}

	@Override
	public String withDraw(String cardId, double money) {
		message = MessageFormat.format("withDraw {0} {1}", cardId , money);
		return this.method();
	}

	@Override
	public String trans(String outCardId, String inCardId, double money) {
		message = MessageFormat.format("trans {0} {1} {2}", outCardId , inCardId , money);
		return this.method();
	}

	@Override
	public String modifyPwd(String cardId, String oldPwd, String newPwd) {
		message = MessageFormat.format("modifyPwd {0} {1} {2}", cardId , oldPwd , newPwd);
		return this.method();
	}

}
