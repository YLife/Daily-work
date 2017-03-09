package com.yl.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test01 {
	public static void main(String[] args) {
		LoginController controller = new LoginController();
		Logger logger = Logger.getLogger(Test01.class);
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = in.next();
		System.out.println("请输入密码：");
		String pwd = in.next();
		
		try {
			controller.check(name, pwd);
			System.out.println("登录成功");
		}  catch (PwdException e) {
			logger.info("用户登录失败");
			e.printStackTrace();
		} finally {
			in.close();
		}
		
	}
}
