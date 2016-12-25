package day1123;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个四位数:");
		int num1=sc.nextInt();
		int num2;
		num2=num1/1000+num1/100%10*10+num1/10%10*100+num1%10*1000;
		System.out.println("num2="+num2);
	}

}
