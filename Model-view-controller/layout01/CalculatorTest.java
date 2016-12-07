package layout01;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CalculatorTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame=new CalculatorFrame();
				frame.setTitle("CalculatorPanel");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
