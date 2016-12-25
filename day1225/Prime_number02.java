package day1123;

public class Prime_number02 {
	public static void main(String[] args) {
		int count=0;
		for (int i =100; i <=200; i++) {
			for (int j = 2; j <=200; j++) {
				if (i%j==0&&i!=j) {
					break;
				}
				if (i%j==0) {
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("质数的个数为:"+count);
	}

}
