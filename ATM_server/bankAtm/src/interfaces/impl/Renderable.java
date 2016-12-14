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
	//ָ��<=>�ַ���  ת����
	private ICommandStringable iCommandStringable = null;
	//����������
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
		System.out.print("����뿨:");
		accountNo = input.next();
		System.out.println("����������:");
		pwd=input.next();
		//����ָ��CheckAccountCommand
		Command cmd = new CheckAccountCommand("CheckAccountCommand", accountNo, pwd);
		//��ָ��ת��ΪString
		String message = iCommandStringable.toString4Network(cmd);
		//����ָ��
		inetwork.send(message);
		//�յ��ظ�
		String reply = inetwork.receive();
		//���ݻظ�������Ӧ����Ӧ
		if ("ok".equals(reply)) {
			this.menu();
		} else {
			System.out.println(reply);
		}
	}

	@Override
	public void menu() {	
		System.out.println("--------------�˵�-----------------");
		System.out.println("  1.���                                             3.��ѯ���  ");
		System.out.println("  2.ȡ��                                             4.�˳�  ");
		System.out.println("----------------------------------");
		System.out.println("��ѡ����Ҫ���еĲ���:");
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
			System.out.println("�ټ� ��");
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.menu();
	}

	@Override
	public void withDraw() {
		System.out.println("������ȡǮ��");
		double money = input.nextDouble();
		Command cmd = new WithDrawCommand("WithDrawCommand", accountNo, pwd,money);
		String message = iCommandStringable.toString4Network(cmd);
		inetwork.send(message);
		String reply = inetwork.receive();
		if ("ok".equals(reply)) {
			System.out.println("ȡǮ�ɹ���");
		} else {
			System.out.println(reply);
		}
	}

	@Override
	public void deposit() {
		System.out.println("�������Ǯ��");
		double money = input.nextDouble();
		Command cmd = new DepositCommand("DepositCommand", accountNo, money);
		String message = iCommandStringable.toString4Network(cmd);
		inetwork.send(message);
		//�յ��ظ�
		String reply = inetwork.receive();
		if ("ok".equals(reply)) {
			System.out.println("���ɹ� ��");
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
		System.out.println("��ǰ���Ϊ��"+reply);
	}

	@Override
	public void exit() {
		System.exit(0);
	}

}
