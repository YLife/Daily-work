package sample03;

public class Test {
	public static void main(String[] args) {
		Deposite money=new Deposite();
		Thread th1=new Thread(money,"Ð¡Ã÷");
		Thread th2= new Thread(money,"Ð¡ÐÇ");
		th1.start();
		th2.start();
	}
}
