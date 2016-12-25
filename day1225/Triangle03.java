package day1123;

public class Triangle03 {
	public static void main(String[] args) {
		int sum=1;
		int j;
		for (int i = 0; i < 5; i++) {
			for ( j =sum; j <=sum+i; j++) {
				System.out.print(j+" ");
			}
		    sum=j;
			System.out.println(" ");
		}
	}

}
