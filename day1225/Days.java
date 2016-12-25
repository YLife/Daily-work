package day1123;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年月日");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		int days=0,day01,i=1;
		while (i<month) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day01 = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day01 = 30;
				break;
			default:
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					day01 = 29;
				} else {
					day01 = 28;
				}
				break;
			}
			days+=day01;
			i++;
		}
		System.out.println(days+day);
	}

}
