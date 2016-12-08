package radioButton;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class RadioButtonFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame=new RadioButtonFrame();
				frame.setTitle("RadioButtonFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
	}
}
