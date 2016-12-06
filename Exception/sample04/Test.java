package sample04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String user = input.next();
		System.out.println("请输入密码:");
		String pwd = input.next();
		
		LoginController lc = new LoginController();
		try {
			lc.login(user, pwd);
			System.out.println("登录成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
