package runnables;
/**
 * ͨ��ʵ��runnable�ӿ�ʵ�ֶ��̣߳����ã�
 * @author Administrator
 *
 */
public class RunIpl implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"���ڴ�ӡ��"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
