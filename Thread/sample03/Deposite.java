package sample03;

public class Deposite implements Runnable {
	
	private int balance=0;
	
	@Override
	public void run() {
		 for (int i = 0; i <3; i++) {
			deposite(1000);
		}
	}
	
	public synchronized void deposite(int money){
		notify();
		balance += money;
		System.out.println(Thread.currentThread().getName() + "Óà¶îÎª:" + balance);
		try {
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
