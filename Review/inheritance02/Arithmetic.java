package inheritance02;

public class Arithmetic {
	private int sum;
	public int add(int a,int b){
		sum= a+b;
		return sum;
	}
}

class Adder extends Arithmetic{
	
}
