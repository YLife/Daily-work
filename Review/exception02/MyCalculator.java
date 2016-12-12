package exception02;

public class MyCalculator {
	public int power(int a ,int b) throws Exception{
		if (a<=0||b<=0) {
			throw new Exception("n and p should be non-nagative");
		}
		int x=1;
		for (int i = 1; i <=b; i++) {
			x*=a;
		}
		return x;
	}
}
