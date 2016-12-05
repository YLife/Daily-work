package swing02;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SizedFrame extends JFrame {
	public SizedFrame(){
		
		//get screen dimensions
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenHeight=screenSize.height;
		int screenWidth=screenSize.width;
		
		//set frame height ,width and let platform pick screen location
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
		
		//set frame icon
		
		Image img=new ImageIcon("icon.gif").getImage();
		setIconImage(img);
	}
}
