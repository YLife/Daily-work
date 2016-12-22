package scanners;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = 1;
		while (sc.hasNext()) {
			System.out.println((no++)+" "+sc.nextLine());
		}
		sc.close();
	}
}
