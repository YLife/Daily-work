package thread;

public class test02 {
	public static void main(String[] args) {
		Thread02 th = new Thread02();
		Thread th1 = new Thread(th, "线程1");
		Thread th2 = new Thread(th, "线程2");
		th1.start();
		th2.start();
	}
}
