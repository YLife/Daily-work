package day1123;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0,a=1;
		for (int i = 0; i < num1; i++) {
			a*=num2;
			sum+=a;
		}
		System.out.println(sum);
	}

}
