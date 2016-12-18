package thread;


public class Tickets  implements Runnable{
	private int tickets = 100;
	private Boolean con = true;
	@Override
	public void run() {
		while (con) {
			this.sell();
		}
		
	}
	public synchronized void sell(){
		if (tickets>0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tickets--;
			System.out.println(Thread.currentThread().getName()+"�����Ѿ�����һ��Ʊ"+",ʣ��Ʊ����"+tickets);
		}else {
			System.out.println("Ʊ�Ѿ����꣡");
			con= false;
		}
	}

}
