package sample04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���:");
		String user = input.next();
		System.out.println("����������:");
		String pwd = input.next();
		
		LoginController lc = new LoginController();
		try {
			lc.login(user, pwd);
			System.out.println("��¼�ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
