package actionEvent04;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ActionFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame=new ActionFrame();
				frame.setTitle("ActionFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
