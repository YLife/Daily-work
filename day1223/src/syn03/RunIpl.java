package syn03;

public class RunIpl implements Runnable{

	@Override
	public synchronized void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+"ÕýÔÚ´òÓ¡£º"+i);
				if (i>3) {
					try {
						notify();
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
	}
	
}
