package sample01;

public class Test {
	public static void main(String[] args) {
		Runnable runipl01=new Run01();
		Thread th01=new Thread(runipl01);
		Runnable runipl02=new Run02();
		Thread th02=new Thread(runipl02);
		th01.start();
		th02.start();
	}
}
