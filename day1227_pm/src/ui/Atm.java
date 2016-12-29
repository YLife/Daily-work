package ui;

import java.util.Scanner;

import request.BankRequest;

public class Atm {
	//当前卡号
	private String current = null;
	private BankRequest br = null;
	Scanner sc = new Scanner(System.in);

	public BankRequest getBr() {
		return br;
	}

	public void setBr(BankRequest br) {
		this.br = br;
	}
	
	/**
	 * 菜单显示
	 */
	
	public void menu(){
		System.out.println("--------------菜单-----------------");
		System.out.println("  1.存款                                             3.查询余额  ");
		System.out.println("  2.取款                                             4.转账  ");
		System.out.println("  5.退出                                               ");
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
		this.menu();
	}
	public void checkAccout(){
		System.out.println("请输入卡号：");
		current = sc.next();
		System.out.println("请输入密码：");
		String pwd = sc.next();
		br.checkAccount(current, pwd); 
		System.out.println("校验成功 ！");
		menu();
	}
	
	public void getBalance(){
		double balance = br.getBalance(current);
		System.out.println(current);
		System.out.println("当前余额为："+balance);
	}
	
	public void deposit(){
		System.out.println("请输入存款金额：");
		double money = sc.nextDouble();
		if (br.deposit(current, money)) {
			System.out.println("存款成功 ！");
		}else {
			System.out.println("存款失败 ！");
		}
	}
	
	public void withDraw(){
		System.out.println("请输入取款金额：");
		double money = sc.nextDouble();
		if (br.withDraw(current, money)) {
			System.out.println("取款成功 !");
		}else {
			System.out.println("取款失败 !");
		}
	}
	
	public void trans(){
		System.out.println("请输入转账账号：");
		String inCardId = sc.next();
		if (br.findAccount(inCardId)) {
			System.out.println("请输入转账金额：");
			double money = sc.nextDouble();
			if (br.getBalance(current)<money) {
				System.out.println("余额不足 !");
			} else {
				if (br.trans(current, inCardId, money)) {
					System.out.println("转账成功 ！");
				} else {
					System.out.println("转账失败 ！");
				}
			}
		}else {
			System.out.println("该账户不存在 ！");
		}
	}
	
	public void exit(){
		System.out.println("欢迎下次光临，再见 ！");
		System.exit(0);
	}
}
