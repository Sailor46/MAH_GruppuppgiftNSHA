package biblio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log extends JFrame {
//fields
	
	JButton blogin = new JButton("Login");
	JPanel panel = new JPanel();
	JLabel greet = new JLabel("<html>Please enter your person number<html>");
	JTextField txuser = new JTextField(15);
//	JPasswordField pass = new JPasswordField(15);
	
	 //create fontstyles
    private Font reg = new Font("SansSerif", Font.BOLD, 22);
    private Font btn = new Font("SansSerif", Font.PLAIN, 18);
	

	//constructor
	public Log() {
		super("Login");
		setSize(600, 600);
		setBackground(Color.ORANGE);
		setLocation(500, 280);
		panel.setLayout(null);

		greet.setBounds(130, 40, 500, 100);
		greet.setFont(reg);
		greet.setForeground(Color.WHITE);
		
		txuser.setBounds(165, 140, 250, 30);
//		pass.setBounds(70, 65, 150, 20);

		blogin.setBounds(250, 200, 80, 60);
		blogin.setFont(btn);

		panel.add(blogin);
		panel.add(greet);
		panel.add(txuser);
//		panel.add(pass);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		actionlogin();
	}

	public void actionlogin() {
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String puname = txuser.getText();
//				String ppaswd = pass.getText();
//				if (puname.equals("test") && ppaswd.equals("12345")) {
				if (puname.equals("test")) {
					Newframe regFace = new Newframe();
					regFace.setVisible(true);
					dispose();
				} else {

					JOptionPane.showMessageDialog(null,
							"Unknown id!");
					txuser.setText("");
//					pass.setText("");
					txuser.requestFocusInWindow();
				}

			}
		});
	}

	public static void main(String[] args) {
		Log frameTabel = new Log();
	}
}
