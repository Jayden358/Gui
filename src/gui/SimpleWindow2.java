package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleWindow2 implements ActionListener {
	JButton button1 = null;
	JButton button2 = null;
	public static void main(String[] args) {
		
			new SimpleWindow2();
	}
	
	public SimpleWindow2() {
		
		
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
		
		
		frame.setLayout(layout);
		frame.setTitle("simple window");
		frame.setSize(400,200);
		frame.setLocation(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel label = new JLabel("This is my label!");
		frame.add(label);
		
		button1 = new JButton("click me!");
		button2 = new JButton ("dont click me");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(button1);
		frame.add(button2);
		button1.setVisible(true);
		button2.setVisible(true);
		frame.pack();
	}
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
		if (control == button1)
		{
			JOptionPane.showMessageDialog(null, "i like red");
		}
		else if (control == button2) {
			JOptionPane.showMessageDialog(null, "i like blue");
			
		}
		
	}
	
}
