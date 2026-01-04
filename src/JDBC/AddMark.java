package JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.*;

public class AddMark {
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
		l.setText("ADD MARKS");
		f.add(l);
		l.setBounds(550, 75, 400, 75);
		l.setFont(new Font("Arial", Font.BOLD, 30));
		
		//This is the label for username
		JLabel username = new JLabel();
		username.setText("Register Number:");
		f.add(username);
		username.setBounds(400, 200, 200, 30);
		username.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField tuser = new JTextField();
		tuser.setBounds(675, 200, 200, 30);
		f.add(tuser);
		
		
		//This is the label for password
		JLabel sub1 = new JLabel();
		sub1.setText("Operating System:");
		f.add(sub1);
		sub1.setBounds(400, 250, 200, 30);
		sub1.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField subt1 = new JTextField();
		subt1.setBounds(675, 250, 200, 30);
		f.add(subt1);
		
		//This is the label for password
		JLabel sub2 = new JLabel();
		sub2.setText("Java Programming:");
		f.add(sub2);
		sub2.setBounds(400, 300, 200, 30);
		sub2.setFont(new Font("Arial", Font.PLAIN, 22));
				
		JTextField subt2 = new JTextField();
		subt2.setBounds(675, 300, 200, 30);
		f.add(subt2);
		
		JLabel sub3 = new JLabel();
		sub3.setText("DBMS:");
		f.add(sub3);
		sub3.setBounds(400, 350, 200, 30);
		sub3.setFont(new Font("Arial", Font.PLAIN, 22));
				
		JTextField subt3 = new JTextField();
		subt3.setBounds(675, 350, 200, 30);
		f.add(subt3);
		
		JLabel sub4 = new JLabel();
		sub4.setText("Distributed System:");
		f.add(sub4);
		sub4.setBounds(400, 400, 200, 30);
		sub4.setFont(new Font("Arial", Font.PLAIN, 22));
				
		JTextField subt4 = new JTextField();
		subt4.setBounds(675, 400, 200, 30);
		f.add(subt4);
		
		JLabel sub5 = new JLabel();
		sub5.setText("Computer Network:");
		f.add(sub5);
		sub5.setBounds(400, 450, 200, 30);
		sub5.setFont(new Font("Arial", Font.PLAIN, 22));
				
		JTextField subt5 = new JTextField();
		subt5.setBounds(675, 450, 200, 30);
		f.add(subt5);
		
		JButton btn = new JButton("Login");
		btn.setBounds(575, 525, 200, 30);
		f.add(btn);
		
		f.setVisible(true);
		
		//event listeners
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String st = tuser.getText(), val0 = subt1.getText();
						String val1 = subt2.getText(), val2 = subt3.getText();
						String val3 = subt4.getText(), val4 = subt5.getText();
						
						
						int stu_id = Integer.parseInt(st);
						int m0 = Integer.parseInt(val0), m1 = Integer.parseInt(val1), m2 = Integer.parseInt(val2);
						
						int m3 = Integer.parseInt(val3), m4 = Integer.parseInt(val4);
				
                        //String arr[] = {val0,val1,val2,val3,val4};
						int marks[] = {m0,m1,m2,m3,m4};
						
						Error er1 = Teacher.addmarks(stu_id, marks);
						
						System.out.println(er1.flag + " " + er1.message);
						if (er1.flag) {
							JOptionPane.showMessageDialog(f, "Marks Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(f, er1.message, "Error", JOptionPane.ERROR_MESSAGE);
						}
	
					}
				});
	
				
	}
}

