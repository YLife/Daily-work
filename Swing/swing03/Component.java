package swing03;

import java.awt.*;

import javax.swing.*;

public class Component extends JComponent {
	public static final int MESSAGE_X=75;
	public static final int MESSAGE_Y=100;
	
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	public void paintComponent(Graphics g){
		g.drawString("Not a Hello, World program",MESSAGE_X , MESSAGE_Y);
	}
	
	public Dimension getPreferedSize(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}
