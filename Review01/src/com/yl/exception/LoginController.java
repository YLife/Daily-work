package com.yl.exception;

public class LoginController {
	public static final String NAME = "hello";
	public static final String PWD = "okay";
	
	public void check(String name , String pwd) throws  PwdException{
		if (!NAME.equals(name)) {
			try {
				throw new NameException();
			} catch (Exception e) {
				System.out.println("“Ï≥£±ª≤∂ªÒ°£°£°£°£°£°£°£°£");
			}
		}
		if (!PWD.equals(pwd)) {
			System.out.println("=========");
			throw new PwdException();
		}
	}
}
