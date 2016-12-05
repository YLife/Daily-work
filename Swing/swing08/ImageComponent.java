package swing08;

import java.awt.*;
import javax.swing.*;

public class ImageComponent extends JComponent {
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	private Image image;
	
	public ImageComponent(){
		image = new ImageIcon("blue-ball.gif").getImage();
	}
	
	public void paintComponent(Graphics g){
		if (image==null) {
			return;
		}
		int imageWidth=-image.getWidth(this);
		int imageHeight=-image.getHeight(this);
		
		//draw the image in the upper-left corner
		g.drawImage(image, 0, 0, null);
		
		//title image across the component
		
		for (int i = 0; i*imageWidth<=getWidth(); i++) {
			for (int j = 0; j*imageHeight<=getHeight(); j++) {
				if (i+j>0) {
					g.copyArea(0, 0, imageWidth, imageHeight, i*imageWidth, j*imageHeight);
				}
			}
		}
	}
	
	public Dimension getPreferedSize(){
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
