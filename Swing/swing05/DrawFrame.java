package swing05;

import javax.swing.JFrame;


public class DrawFrame extends JFrame {
	public DrawFrame(){
		add(new DrawComponent());
		pack();
	}
}
