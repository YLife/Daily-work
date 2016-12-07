package layout02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextComponentFrame extends JFrame {
	public static final int TEXTAREA_ROWS=8;
	public static final int TEXTAREA_COLUMNS=20;
	
	public TextComponentFrame(){
		final JTextField textField=new JTextField();
		final JPasswordField passwordField=new JPasswordField();
		
		JPanel northJPanel=new JPanel();
		northJPanel.setLayout(new GridLayout(2, 2));
		northJPanel.add(new JLabel("User name£º", SwingConstants.RIGHT));
		northJPanel.add(textField);
		northJPanel.add(new JLabel("Password:", SwingConstants.RIGHT));
		northJPanel.add(passwordField);
		
		add(northJPanel,BorderLayout.NORTH);
		
		final JTextArea textArea=new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
		JScrollPane scrollPane=new JScrollPane(textArea);
		
		add(scrollPane,BorderLayout.CENTER);
		
		//add button to append text into the text area
		
		JPanel southPanel=new JPanel();
		
		JButton insertButton=new JButton("insert");
		southPanel.add(insertButton);
		insertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				textArea.append("User name:"+textField.getText()+"Password:"+new String(passwordField.getPassword()+"\n"));
			}
		});
		
		add(southPanel, BorderLayout.SOUTH);
		pack();
	}
}
