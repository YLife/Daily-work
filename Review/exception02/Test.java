package exception02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			int p= sc.nextInt();
			try {
				MyCalculator my_calculator=new MyCalculator();
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}
		sc.close();
	}
}
