package syn03;

public class Test {
	public static void main(String[] args) {
		RunIpl target = new RunIpl();
		Thread th01 = new Thread(target,"�߳�1");
		Thread th02 = new Thread(target,"�߳�2");
		th01.start();
		th02.start();
	}
}
