package threads;
/**
 * ͨ����дthread���run����ʵ�ֶ��̣߳����ڼ̳еĵ����ԣ�һ�㲻���ô˷�����
 * @author Administrator
 *
 */
public class Mythread extends Thread {
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
