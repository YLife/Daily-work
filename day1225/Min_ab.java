package day1123;
/*
 * a*b=2048,a,b为何值时，a+b有最小值
 */

public class Min_ab {
	public static void main(String[] args) {
		int x=1;
		int y=2048;
		int a =x;
		int b = y;
		int z,min = 2049;
		for ( x = 1; x <=2048; x++) {
			if (y%x==0) {
				z=y/x;
				if (z+x<a+b) {
					a=x;
					b=z;
					min=a+b;
				}
			}
		}
		
		System.out.println("a="+a+" b="+b+" min="+min);
		
	}
	
	

}
