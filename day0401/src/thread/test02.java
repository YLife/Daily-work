package thread;

public class test02 {
	public static void main(String[] args) {
		Thread02 th = new Thread02();
		Thread th1 = new Thread(th, "�߳�1");
		Thread th2 = new Thread(th, "�߳�2");
		th1.start();
		th2.start();
	}
}
