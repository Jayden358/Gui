package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class LayoutWindow2 {
	JFrame myFrame;
	JPanel contentPane;
	FlowLayout fLayout;
	GridLayout gLayout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel myPanel;

	public static void main(String[] args) {
		new LayoutWindow2();

	}
	public LayoutWindow2() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel=(JPanel)myFrame.getContentPane();
		myFrame.setSize(200,200);
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.X_AXIS));
		
		//child JPanel for top area
		JPanel topPanel= new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		//label that will go on top child JPanel
		JLabel myLabel = new JLabel("what is your favorite fruit?");
		topPanel.add(myLabel);
		
		//child JPanel for bottom area
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,2,2));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		//buttons that will go in bottom child JPanel
		bottomPanel.add(new JButton("apple"));
		bottomPanel.add(new JButton("orange"));
		bottomPanel.add(new JButton("pear"));
		bottomPanel.add(new JButton("banana"));
		myPanel.add(topPanel);
		myPanel.add(bottomPanel);
		myFrame.setVisible(true);
		
		
	}

}