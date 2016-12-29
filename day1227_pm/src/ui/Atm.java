package ui;

import java.util.Scanner;

import request.BankRequest;

public class Atm {
	//��ǰ����
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
	 * �˵���ʾ
	 */
	
	public void menu(){
		System.out.println("--------------�˵�-----------------");
		System.out.println("  1.���                                             3.��ѯ���  ");
		System.out.println("  2.ȡ��                                             4.ת��  ");
		System.out.println("  5.�˳�                                               ");
		System.out.println("----------------------------------");
		System.out.println("��ѡ����Ҫ���еĲ���:");
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
			System.out.println("��������");
			break;
		}
		System.out.println("��ת�У���ȴ�����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.menu();
	}
	public void checkAccout(){
		System.out.println("�����뿨�ţ�");
		current = sc.next();
		System.out.println("���������룺");
		String pwd = sc.next();
		br.checkAccount(current, pwd); 
		System.out.println("У��ɹ� ��");
		menu();
	}
	
	public void getBalance(){
		double balance = br.getBalance(current);
		System.out.println(current);
		System.out.println("��ǰ���Ϊ��"+balance);
	}
	
	public void deposit(){
		System.out.println("���������");
		double money = sc.nextDouble();
		if (br.deposit(current, money)) {
			System.out.println("���ɹ� ��");
		}else {
			System.out.println("���ʧ�� ��");
		}
	}
	
	public void withDraw(){
		System.out.println("������ȡ���");
		double money = sc.nextDouble();
		if (br.withDraw(current, money)) {
			System.out.println("ȡ��ɹ� !");
		}else {
			System.out.println("ȡ��ʧ�� !");
		}
	}
	
	public void trans(){
		System.out.println("������ת���˺ţ�");
		String inCardId = sc.next();
		if (br.findAccount(inCardId)) {
			System.out.println("������ת�˽�");
			double money = sc.nextDouble();
			if (br.getBalance(current)<money) {
				System.out.println("���� !");
			} else {
				if (br.trans(current, inCardId, money)) {
					System.out.println("ת�˳ɹ� ��");
				} else {
					System.out.println("ת��ʧ�� ��");
				}
			}
		}else {
			System.out.println("���˻������� ��");
		}
	}
	
	public void exit(){
		System.out.println("��ӭ�´ι��٣��ټ� ��");
		System.exit(0);
	}
}
