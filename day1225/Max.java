package day1123;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int max=num1;
		if (num2>max) {
			max=num2;
		}
		System.out.println("请再输入一个数:");
		int num3=sc.nextInt();
		max=num3>max?num3:max;
		System.out.println(max);
    }

}
