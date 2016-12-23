package threads;

public class Threads {
	public static void main(String[] args) {
		Mythread th01 = new Mythread();
		Mythread th02 = new Mythread();
		th01.setName("线程1");
		th02.setName("线程2");
		th02.start();
		th01.start();
	}
	
}
