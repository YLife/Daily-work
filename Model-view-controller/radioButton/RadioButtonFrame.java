package radioButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private ButtonGroup group;
	private JLabel label;
	private static final int DEFAULT_SIZE=36;
	
	public RadioButtonFrame(){
		//add the sample text label
		label=new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font .PLAIN, DEFAULT_SIZE));
		add(label, BorderLayout.CENTER);
		//add the radio buttons
		buttonPanel=new JPanel();
		group =new ButtonGroup();
		
		addRadioButton("Small", 8);
		addRadioButton("Medium", 12);
		addRadioButton("Large", 18);
		addRadioButton("Extra large", 36);
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	
	public void addRadioButton(String name,final int size){
		boolean selected=size==DEFAULT_SIZE;
		JRadioButton button=new JRadioButton(name, selected);
		group.add(button);
		buttonPanel.add(button);
		
		//this listener sets the label font size 
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//size refers to the final parameter of the addRadioButton
				//method 
				label.setFont(new Font("Serif", Font.PLAIN, size));
			}
		};
		
		button.addActionListener(listener);
	}
}
