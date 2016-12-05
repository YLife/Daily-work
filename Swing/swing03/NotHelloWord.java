package swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class NotHelloWord {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame=new Frame();
				frame.setTitle("NotHelloWorld");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
				
	}
}
