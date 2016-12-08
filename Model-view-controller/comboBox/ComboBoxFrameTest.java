package comboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ComboBoxFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame=new ComboBoxFrame();
				frame.setTitle("Border"
						+ "Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
	}
}
