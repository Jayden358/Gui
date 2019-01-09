package gui;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TwoButtons implements ActionListener {
	JButton redButton = null;
	JButton greenButton = null;
	JFrame myFrame;
	public static void main(String[] args) {
		//instance of 2 buttons
		new TwoButtons();
	}
		//constructer
		public TwoButtons() {
		//create new JFrame
		 myFrame = new JFrame();
		//set title, size, location
		myFrame.setTitle("Choose your color");
		myFrame.setSize(550,150);
		myFrame.setLocation(200,300);
		
		//close
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//assign layout
		//FlowLayout myLayout = new FlowLayout();
		
		
		GridLayout myLayout = new GridLayout(3,2);
		myFrame.setLayout(myLayout);
		//add buttons
		redButton = new JButton("Red");
		greenButton = new JButton("Green");
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		myFrame.add(redButton);
		myFrame.add(new JLabel(""));
		myFrame.add(new JLabel(""));
		myFrame.add(new JLabel(""));
		myFrame.add(new JLabel(""));
		myFrame.add(greenButton);
		
		//frame visible
		myFrame.setVisible(true);	
	}
		public void actionPerformed(ActionEvent event) {
			Object control = event.getSource();
			
			if(control == redButton) {
				myFrame.getContentPane().setBackground(Color.red);
			}
			else if (control == greenButton) {
				myFrame.getContentPane().setBackground(Color.green);
			}
		}
}
