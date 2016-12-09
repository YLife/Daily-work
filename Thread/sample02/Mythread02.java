package sample02;

public class Mythread02 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			if (i%2==1) {
				System.out.println("ÆæÊýÓÐ:"+i);
			}
		}
	}
}
