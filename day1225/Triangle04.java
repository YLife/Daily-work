package day1123;

public class Triangle04 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=6-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
