package day1123;

public class Min_ab01 {
	public static void main(String[] args) {
		int x=1;
		int y=1;
		int a = 0,b = 0,sum,min=2049;
		for ( x = 1; x <=2048; x++) {
			for (y = 1; y <=2048; y++) {
				if (x*y==2048) {
					sum=x+y;
					if (min>sum) {
						min=sum;
						a=x;
						b=y;
					}
				}
			}
		}
		System.out.println("a="+a+" b="+b+" min="+min);
	}

}
