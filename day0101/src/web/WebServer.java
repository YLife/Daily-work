package web;

import java.net.Socket;

import config.ApplicationConfig;
import biz.BankBiz;

/**
 * 执行多线程
 * @author YangLun
 *
 */
public class WebServer implements Runnable {
	private Socket socket = null;
	private BankBiz biz = ApplicationConfig.getBankBiz();
	
	WebServer(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		String message = NetWork.receive(socket);
		System.out.println("接受到客户端请求：" + message);
		String[] str = message.split(" ");
		//解析接受消息
		switch (str[0]) {
		case "findAccount":
			message = biz.findAccount(str[1]);
			break;
		case "checkAccount":
			message = biz.checkAccount(str[1], str[2]);
			break;
		case "getBalance":
			message = String.valueOf(biz.getBalance(str[1]));
			break;
		case "deposit":
			message = biz.deposit(str[1], Double.parseDouble(str[2]));
			break;
		case "withDraw":
			message = biz.withDraw(str[1], Double.parseDouble(str[2]));
			break;
		case "trans":
			message = biz.trans(str[1], str[2] , Double.parseDouble(str[3]));
			break;
		case "modifyPwd":
			message = biz.modifyPwd(str[1], str[2] , str[3]);
			break;
		default:
			System.out.println(BankBiz.E);
			break;
		}
		
		System.out.println("即将回复消息："+ message);
		NetWork.send(socket, message);
		NetWork.close(socket);
	}

}
