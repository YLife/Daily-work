package day1206;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("«Î ‰»ÎƒÍ¡‰:");
		int age=sc.nextInt();
		sc.close();
		try {
			stu.setAge(age);
		} catch (Exception e) {
			e.getClass().getName();
			e.printStackTrace();
		}
		
	}
}
