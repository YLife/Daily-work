package actionEvent02;

import java.awt.EventQueue;

import javax.swing.JFrame;

import actionEvent01.ButtonFrame;

public class PlafFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame=new PlafFrame();
				frame.setTitle("PlafFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
	}
}
