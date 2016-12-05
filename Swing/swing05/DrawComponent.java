package swing05;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JComponent;

public class DrawComponent extends JComponent {
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIFHT=400;
	
	public void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		double leftX=100;
		double topY=100;
		double width=200;
		double height=150;
		
		Rectangle2D rect=new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		g2.setBackground(SystemColor.desktop);
		
		Line2D line=new Line2D.Double(leftX, topY, leftX+width, topY+height);
		g2.draw(line);
		
		Ellipse2D ellipse=new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		g2.setPaint(new Color(0, 128, 128));
		g2.drawString("hello", 20, 20);
		
		double centerX=rect.getCenterX();
		double centerY=rect.getCenterY();
		double radius=150;
		
		Ellipse2D circle=new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+radius,centerY+radius);
		g2.draw(circle);
		
	}
	public Dimension getPreferedSize(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIFHT);
	}
}
