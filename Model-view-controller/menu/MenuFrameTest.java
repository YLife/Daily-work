package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame=new MenuFrame();
				frame.setTitle("MenuFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
