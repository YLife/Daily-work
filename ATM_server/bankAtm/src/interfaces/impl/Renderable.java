package interfaces.impl;

import java.util.Scanner;

import models.CheckAccountCommand;
import models.Command;
import models.DepositCommand;
import models.QueryBalanceCommand;
import models.WithDrawCommand;
import interfaces.ICommandStringable;
import interfaces.IRenderable;
import interfaces.Inetwork;

public class Renderable implements IRenderable {

	Scanner input = new Scanner(System.in);
	//指令<=>字符串  转换器
	private ICommandStringable iCommandStringable = null;
	//网络适配器
	private Inetwork inetwork = null;
	
	private String pwd;
	private String accountNo;
	
	
	//getters and setters
	public Inetwork getInetwork() {
		return inetwork;
	}
	
	public void setInetwork(Inetwork inetwork) {
		this.inetwork = inetwork;
	}
	
	public ICommandStringable getiCommandStringable() {
		return iCommandStringable;
	}

	public void setiCommandStringable(ICommandStringable iCommandStringable) {
		this.iCommandStringable = iCommandStringable;
	}

	@Override
	public void insertCard() {
		System.out.print("请插入卡:");
		accountNo = input.next();
		System.out.println("请输入密码:");
		pwd=input.next();
		//创建指令CheckAccountCommand
		Command cmd = new CheckAccountCommand("CheckAccountCommand", accountNo, pwd);
		//将指令转换为String
		String message = iCommandStringable.toString4Network(cmd);
		//发送指令
		inetwork.send(message);
		//收到回复
		String reply = inetwork.receive();
		//根据回复做出相应的响应
		if ("ok".equals(reply)) {
			this.menu();
		} else {
			System.out.println(reply);
		}
	}

	@Override
	public void menu() {	
		System.out.println("--------------菜单-----------------");
		System.out.println("  1.存款                                             3.查询余额  ");
		System.out.println("  2.取款                                             4.退出  ");
		System.out.println("----------------------------------");
		System.out.println("请选择需要进行的操作:");
		int num=input.nextInt();
		switch (num) {
		case 1:
			this.deposit(); 
			break;
		case 2:
			this.withDraw(); 
			break;
		case 3:
			this.queryBalance();
			break;
		case 4:
			System.out.println("再见 ！");
			exit();
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		System.out.println("跳转中，请等待……");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.menu();
	}

	@Override
	public void withDraw() {
		System.out.println("请输入取钱金额：");
		double money = input.nextDouble();
		Command cmd = new WithDrawCommand("WithDrawCommand", accountNo, pwd,money);
		String message = iCommandStringable.toString4Network(cmd);
		inetwork.send(message);
		String reply = inetwork.receive();
		if ("ok".equals(reply)) {
			System.out.println("取钱成功！");
		} else {
			System.out.println(reply);
		}
	}

	@Override
	public void deposit() {
		System.out.println("请输入存钱金额：");
		double money = input.nextDouble();
		Command cmd = new DepositCommand("DepositCommand", accountNo, money);
		String message = iCommandStringable.toString4Network(cmd);
		inetwork.send(message);
		//收到回复
		String reply = inetwork.receive();
		if ("ok".equals(reply)) {
			System.out.println("存款成功 ！");
		} else {
			System.out.println(reply);
		}
	}

	@Override
	public void queryBalance() {
		Command cmd = new QueryBalanceCommand("QueryBalanceCommand", accountNo);
		String message = iCommandStringable.toString4Network(cmd);
		inetwork.send(message);
		String reply = inetwork.receive();
		System.out.println("当前余额为："+reply);
	}

	@Override
	public void exit() {
		System.exit(0);
	}

}
