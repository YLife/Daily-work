package com.yl.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test01 {
	public static void main(String[] args) {
		LoginController controller = new LoginController();
		Logger logger = Logger.getLogger(Test01.class);
		Scanner in = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = in.next();
		System.out.println("���������룺");
		String pwd = in.next();
		
		try {
			controller.check(name, pwd);
			System.out.println("��¼�ɹ�");
		}  catch (PwdException e) {
			logger.info("�û���¼ʧ��");
			e.printStackTrace();
		} finally {
			in.close();
		}
		
	}
}
