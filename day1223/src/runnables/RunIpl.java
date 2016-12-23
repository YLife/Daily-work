package runnables;
/**
 * 通过实现runnable接口实现多线程（常用）
 * @author Administrator
 *
 */
public class RunIpl implements Runnable{
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
