package sample04;

public class Print implements Runnable {
	private int i = 1;

	@Override
	public void run() {
		for (; i < 101;) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + "£º" + i++);
				try {
					notify();
					wait(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
