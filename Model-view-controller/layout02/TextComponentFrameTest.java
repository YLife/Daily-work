package layout02;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class TextComponentFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame=new TextComponentFrame();
				frame.setTitle("TextComponentFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
