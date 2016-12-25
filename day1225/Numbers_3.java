package day1123;
/*
 * 用1,2,3,4可以组成多少无重复数字的三位数
 */
public class Numbers_3 {
	public static void main(String[] args) {
		int x,y,z,number,count=0;
		for ( x = 1; x <=4; x++) {
			for ( y = 1; y <=4; y++) {
				if (y!=x) {
					for (z = 1; z<=4; z++) {
						if (z!=x&&z!=y) {
							number=x*100+y*10+z;
							count++;
							System.out.println("number="+number+" 个数为:"+count);
						}
					}
				}
				 
			}
		}
	}
}
