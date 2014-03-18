package biblio;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Newframe extends JFrame {
//fields
    
	JLabel welcome = new JLabel("<html>Welcome to GhettoLibrary<html>");
	JPanel panel = new JPanel();
	JButton borrow = new JButton("Borrow");
	JButton ret = new JButton("Return");
	JTextArea viewList = new JTextArea();
	
	 //create fontstyles
    private Font reg = new Font("SansSerif", Font.BOLD, 22);
    private Font btn = new Font("SansSerif", Font.PLAIN, 18);
    
//constructor
	public Newframe() {
		super("Welcome");
		setSize(600, 600);
		setLocation(500, 280);
		setBackground(Color.ORANGE);
		panel.setLayout(null);

		welcome.setBounds(70, 5, 450, 100);
		welcome.setFont(reg);
		welcome.setForeground(Color.WHITE);
		
		ret.setBounds(70, 120, 100, 50);
		ret.setFont(btn);
		
		borrow.setBounds(170, 120, 100, 50);
		borrow.setFont(btn);
		
		viewList.setBounds(0, 200, 600, 400);
		viewList.setFont(btn);

		panel.add(welcome);
		panel.add(ret);
		panel.add(borrow);
		panel.add(viewList);
		

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void showMediaList (String mediaList)	{
		String msg = "";
    	msg = ("Your loanlist: " + mediaList );
    	viewList.setText(msg);
    }
	
	public static void main(String[] args) {
		Newframe frameTabel = new Newframe();
	}
	
	
}
