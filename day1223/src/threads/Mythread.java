package threads;
/**
 * 通过重写thread类的run方法实现多线程（由于继承的单根性，一般不采用此方法）
 * @author Administrator
 *
 */
public class Mythread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"正在打印："+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
