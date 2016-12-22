package exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String accNo = sc.next();
		String pwd = sc.next();
		LoginControllor login = new LoginControllor();
		try {
			login.login(accNo, pwd);
		} catch (AccNotFound e) {
			System.out.println(e);
		} catch (PwdErrorException e) {
			System.out.println(e);
		}
		sc.close();
	}
}
