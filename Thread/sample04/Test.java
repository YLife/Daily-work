package sample04;

import sample04.Print;

public class Test {
	public static void main(String[] args) {
		Print print =new Print();
		Thread th1=new Thread(print,"打印机1");
		Thread th2= new Thread(print,"打印机2");
		th1.start();
		th2.start();
	}
}
