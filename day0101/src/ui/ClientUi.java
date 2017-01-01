package ui;

import java.util.Scanner;

import biz.BankBiz;
import resquest.client.ClientResquest;

public class ClientUi {
	private ClientResquest cr= null;
	//当前卡号
	private String current = null; 
	private Scanner sc = new Scanner(System.in);
	
	public ClientResquest getCr() {
		return cr;
	}


	public void setCr(ClientResquest cr) {
		this.cr = cr;
	}


	public void checkAccount(){
		System.out.println("请输入卡号：");
		current = sc.next();
		System.out.println("请输入密码：");
		String pwd = sc.next();
		if (cr.checkAccount(current, pwd).equals(BankBiz.S)) {
			System.out.println("登录成功……");
			showMenu();
		}
	}
	
	public void showMenu(){
		System.out.println("--------------菜单-----------------");
		System.out.println("  1.存款                                             3.查询余额  ");
		System.out.println("  2.取款                                             4.转账  ");
		System.out.println("  5.修改密码                                     6.退出      ");
		System.out.println("----------------------------------");
		System.out.println("请选择需要进行的操作:");
		int num= sc.nextInt();
		switch (num) {
		case 1:
			this.deposit(); 
			break;
		case 2:
			this.withDraw(); 
			break;
		case 3:
			this.getBalance();
			break;
		case 4:
			this.trans();
			break;
		case 5:
			this.modifyPwd();
			break;	
		case 6:
			exit();
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		System.out.println("跳转中，请等待……");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.showMenu();
	}
	
	public void getBalance(){
		System.out.println(current);
		System.out.println("当前余额为：" + cr.getBalance(current));
	}
	
	public void deposit(){
		System.out.println("请输入存款金额：");
		double money = sc.nextDouble();
		System.out.println(cr.deposit(current, money));
	}
	
	public void withDraw(){
		System.out.println("请输入取款金额：");
		double money = sc.nextDouble();
		System.out.println(cr.withDraw(current, money));
	}
	
	public void trans(){
		System.out.println("请输入转入方卡号：");
		String cardId = sc.next();
		System.out.println("请输入转账金额：");
		double money = sc.nextDouble();
		System.out.println(cr.trans(current, cardId, money));
	}
	
	public void modifyPwd(){
		System.out.println("请输入原始密码：");
		String oldPwd = sc.next();
		System.out.println("请输入新密码：");
		String newPwd1 = sc.next();
		System.out.println("请再次确认新密码：");
		String newPwd2 = sc.next();
		if (newPwd1 != null && newPwd1.equals(newPwd2)) {
			System.out.println(cr.modifyPwd(current, oldPwd, newPwd1));
		}else {
			System.out.println("两次输入的密码不一致 ！");
		}
	}
	
	public void exit(){
		System.out.println("感谢您的使用 ，再见 ！");
		System.exit(0);
	}
}
