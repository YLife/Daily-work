package sample02;

public class Test {
	public static void main(String[] args) {
		Thread th01=new Mythread01();
		Thread th02=new Mythread02();
		th01.start();
		th02.start();
	}
}
