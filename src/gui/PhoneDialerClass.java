package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PhoneDialerClass implements ActionListener {
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonDash;
    JButton DialNumber;
    String phoneNumber=("");

    

    public static void main(String[] args) {
                new PhoneDialerClass(); 
    }
    //constructor
    public PhoneDialerClass() {
       phoneNumber="";
        JFrame frame=new JFrame();
       
        
        
        frame.setTitle("Dialer");
        frame.setSize(200,250);
        frame.setLocation(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel mainPanel =(JPanel)frame.getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        JPanel labelPanel=new JPanel();
        labelPanel.setLayout(new FlowLayout());
        JLabel myLabel = new JLabel("Enter Number");
        labelPanel.add(myLabel);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,3,5,5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDash = new JButton("-");
        button0 = new JButton("0");
        
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDash);
        buttonPanel.add(button0);
        mainPanel.add(labelPanel);
        mainPanel.add(buttonPanel);
        DialNumber=new JButton("Dial");
        DialNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(DialNumber);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0 .addActionListener(this);
        buttonDash.addActionListener(this);
        DialNumber.addActionListener(this);
        
        frame.setVisible(true);
        

    }
    //action performed method
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == DialNumber){
            JOptionPane.showMessageDialog(null,"Dailing: "+phoneNumber);
            phoneNumber="";
           }
           
           else if (e.getSource()==button1){
              phoneNumber = phoneNumber+"1"; 
            } 
            else if (e.getSource()==button2){
              phoneNumber = phoneNumber+"2"; 
            } 
            else if (e.getSource()==button3){
              phoneNumber = phoneNumber+"3"; 
            } 
            else if (e.getSource()==button4){
              phoneNumber = phoneNumber+"4"; 
            } 
            else if (e.getSource()==button5){
              phoneNumber = phoneNumber+"5"; 
            } 
            else if (e.getSource()==button6){
              phoneNumber = phoneNumber+"6"; 
            } 
            else if (e.getSource()==button7){
              phoneNumber = phoneNumber+"7"; 
            } 
            else if (e.getSource()==button8){
              phoneNumber = phoneNumber+"8"; 
            } 
            else if (e.getSource()==button9){
              phoneNumber = phoneNumber+"9"; 
            } else if (e.getSource()==button0){
              phoneNumber = phoneNumber+"0"; 
            } else if (e.getSource()==buttonDash){
              phoneNumber = phoneNumber+"-"; 
            } 
        }
    }
