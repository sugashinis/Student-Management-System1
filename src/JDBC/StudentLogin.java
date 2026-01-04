package JDBC;

import java.awt.Font;

import javax.swing.*;
public class StudentLogin {
	public static void main(String[] args) {
		
		//This is the frame which is displayed when the app is invoked
		JFrame f = new JFrame();
		f.setSize(1920, 1080);
		f.setLayout(null);
		f.setTitle("Student management System");
		f.setLocationRelativeTo(null);
		//Close the frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//This is used to show the heading
		JLabel l = new JLabel();
		l.setText("STUDENT LOGIN");
		f.add(l);
		l.setBounds(550, 100, 400, 100);
		l.setFont(new Font("Arial", Font.BOLD, 30));
		
		//This is the label for username
		JLabel username = new JLabel();
		username.setText("Register Number:");
		f.add(username);
		username.setBounds(475, 250, 200, 100);
		username.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField tuser = new JTextField();
		tuser.setBounds(675, 285, 200, 30);
		f.add(tuser);
		
		
		//This is the label for password
		JLabel password = new JLabel();
		password.setText("Password:");
		f.add(password);
		password.setBounds(475, 320, 200, 100);
		password.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField tpass = new JTextField();
		tpass.setBounds(675, 355, 200, 30);
		f.add(tpass);
		
		JButton btn = new JButton("Login");
		btn.setBounds(575, 430, 200, 30);
		f.add(btn);
		
		
		f.setVisible(true);
	}
}
