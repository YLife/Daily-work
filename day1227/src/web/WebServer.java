package web;

import java.net.Socket;

import config.ApplicationContext;
import biz.BankBiz;


public class WebServer implements Runnable {
	
	private Socket socket = null;
	
	private BankBiz biz = ApplicationContext.getBankBiz() ;
	
	public WebServer(Socket socket){
		this.socket = socket ;
	}

	@Override
	public void run() {
		String message = NetWork.receive(socket);
		System.out.println("���ܵ��ͻ�����Ϣ��"+message);
		String[] str = message.split(" ");
		switch (str[0]) {
		case "findAccount":
			message = String.valueOf(biz.findAccount(str[1]));
			break;
		case "checkAccount":
			System.out.println(biz.checkAccount(str[1], str[2]));
			message = String.valueOf(biz.checkAccount(str[1], str[2]));
			break;
		case "getBalance":
			message = String.valueOf(biz.getBalance(str[1]));
			break;
		case "deposit":
			message = String.valueOf(biz.deposit(str[1],Double.parseDouble(str[2])));
			break;
		case "withDraw":
			message = String.valueOf(biz.withDraw(str[1], Double.parseDouble(str[2])));
			break;
		case "trans":
			message = String.valueOf(biz.trans(str[1], str[2], Double.parseDouble(str[3])));
			break;
		default:
			System.out.println("�������� ��");
			break;
		}
		System.out.println("�����ظ���"+message);
		NetWork.send(socket, message);
		NetWork.close(socket);
		
	}

}
