package thread;

public class Th {
	public static void main(String[] args) throws Exception {
		Runnable run = new Tickets();
		Thread th01 = new Thread(run,"A");
		Thread th02 = new Thread(run,"B");
		Thread th03 = new Thread(run,"C");
		
		th01.start();
		th02.start();
		th03.start();
	}
}
