package syn02;

public class RunIpl implements Runnable{

	@Override
	public void run() {
		synchronized(this){
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+"ÕýÔÚ´òÓ¡£º"+i);
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
	
}
