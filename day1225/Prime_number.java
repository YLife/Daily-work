package day1123;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int num=sc.nextInt();
		System.out.print(num+"=");
		for (int i = 2; i <num; i++) {
		     while (num%i==0) {
		    	num/=i;
				System.out.print(i+"*");
			}
		}
		System.out.print(num);
	}

}
