package day1123;

public class Age {
	public static void main(String[] args) {
		int x,y;
		for ( x = 1; x< 33; x++) {
			for ( y = 1; y < 30; y++) {
				if (x*x+y==1053&&x+y*y==873) {
					System.out.println("������:"+x+"��   �����:"+y+"��");
					break;
				}
			}
		}
	}

}
