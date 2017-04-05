package day0405;

public class Test3 {
	
	public static void main(String[] args) {
		Thread t = new Thread(){
			@Override
			public void run() {
				pong();
			}
		};
		t.start();
		System.out.println("ping");
	}
	
	public static void pong(){
		System.out.println("pong");
	}
}
