package thread;

import java.util.List;

public class Thread01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
	
}
