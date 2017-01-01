package ui;

import java.util.Scanner;

import biz.BankBiz;
import resquest.client.ClientResquest;

public class ClientUi {
	private ClientResquest cr= null;
	//��ǰ����
	private String current = null; 
	private Scanner sc = new Scanner(System.in);
	
	public ClientResquest getCr() {
		return cr;
	}


	public void setCr(ClientResquest cr) {
		this.cr = cr;
	}


	public void checkAccount(){
		System.out.println("�����뿨�ţ�");
		current = sc.next();
		System.out.println("���������룺");
		String pwd = sc.next();
		if (cr.checkAccount(current, pwd).equals(BankBiz.S)) {
			System.out.println("��¼�ɹ�����");
			showMenu();
		}
	}
	
	public void showMenu(){
		System.out.println("--------------�˵�-----------------");
		System.out.println("  1.���                                             3.��ѯ���  ");
		System.out.println("  2.ȡ��                                             4.ת��  ");
		System.out.println("  5.�޸�����                                     6.�˳�      ");
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
			this.modifyPwd();
			break;	
		case 6:
			exit();
			break;
		default:
			System.out.println("��������");
			break;
		}
		System.out.println("��ת�У���ȴ�����");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.showMenu();
	}
	
	public void getBalance(){
		System.out.println(current);
		System.out.println("��ǰ���Ϊ��" + cr.getBalance(current));
	}
	
	public void deposit(){
		System.out.println("���������");
		double money = sc.nextDouble();
		System.out.println(cr.deposit(current, money));
	}
	
	public void withDraw(){
		System.out.println("������ȡ���");
		double money = sc.nextDouble();
		System.out.println(cr.withDraw(current, money));
	}
	
	public void trans(){
		System.out.println("������ת�뷽���ţ�");
		String cardId = sc.next();
		System.out.println("������ת�˽�");
		double money = sc.nextDouble();
		System.out.println(cr.trans(current, cardId, money));
	}
	
	public void modifyPwd(){
		System.out.println("������ԭʼ���룺");
		String oldPwd = sc.next();
		System.out.println("�����������룺");
		String newPwd1 = sc.next();
		System.out.println("���ٴ�ȷ�������룺");
		String newPwd2 = sc.next();
		if (newPwd1 != null && newPwd1.equals(newPwd2)) {
			System.out.println(cr.modifyPwd(current, oldPwd, newPwd1));
		}else {
			System.out.println("������������벻һ�� ��");
		}
	}
	
	public void exit(){
		System.out.println("��л����ʹ�� ���ټ� ��");
		System.exit(0);
	}
}
