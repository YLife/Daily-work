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
			System.out.println(Thread.currentThread().getName()+"窗口已经出售一张票"+",剩余票数："+tickets);
		}else {
			System.out.println("票已经售完！");
			con= false;
		}
	}

}
