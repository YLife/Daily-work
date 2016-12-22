package statics;

import java.util.Scanner;

public class Statics {
	static int B,H;
	static Boolean flag = true;
	static{
		Scanner sc= new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		try {
			if (H<=0||B<=0) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		if (flag) {
			System.out.println(B*H);
		}
		
	}
}
