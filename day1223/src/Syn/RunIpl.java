package Syn;

public class RunIpl implements Runnable{

	@Override
	public void run() {
		synchronized(this){
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+"ÕýÔÚ´òÓ¡£º"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
