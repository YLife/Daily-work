package borderFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class BorderFrame extends JFrame {
	private JPanel demoPanel;
	private JPanel buttonPanel;
	private ButtonGroup group;
	
	public BorderFrame(){
		demoPanel=new JPanel();
		buttonPanel=new JPanel();
		group=new ButtonGroup();
		
		addRadioButton("Lower bevel", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Raised bevel", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Etched", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Line", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Matter", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Empty", BorderFactory.createLoweredBevelBorder());
		
		Border etched=BorderFactory.createEtchedBorder();
		Border title=BorderFactory.createTitledBorder(etched, "Border types");
		buttonPanel.setBorder(title);
		
		setLayout(new GridLayout(2, 1));
		add(buttonPanel);
		add(demoPanel);
		pack();
		
	
	}
	
	public void addRadioButton(String buttonName,final Border b){
		JRadioButton button=new JRadioButton(buttonName);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				demoPanel.setBorder(b);
			}
		});
		group.add(button);
		buttonPanel.add(button);
	}
}
