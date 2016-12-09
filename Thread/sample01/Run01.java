package sample01;

public class Run01 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				System.out.println("Å¼ÊýÓÐ:"+i);
			}
		}

	}

}
