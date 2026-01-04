package JDBC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignUp {
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		f.setSize(1920,1080);
		f.setTitle("Sign Up");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JLabel l=new JLabel();
	    l.setText("Sign Up");
	    f.add(l);
	    l.setBounds(650,100,200,100);
	    l.setFont(new Font("Arial",Font.BOLD,30));
		
	    JLabel name = new JLabel();
		name.setText("Name:");
		f.add(name);
		name.setBounds(500, 260, 200, 100);
		name.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_name = new JTextField();
		t_name.setBounds(700, 295, 200, 30);
		f.add(t_name);
		
		JLabel username = new JLabel();
		username.setText("Username:");
		f.add(username);
		username.setBounds(500, 310, 200, 100);
		username.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_user = new JTextField();
		t_user.setBounds(700, 342, 200, 30);
		f.add(t_user);
		
		JLabel password= new JLabel();
		password.setText("Password:");
		f.add(password);
		password.setBounds(500, 360, 200, 100);
		password.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_pass = new JTextField();
		t_pass.setBounds(700, 392, 200, 30);
		f.add(t_pass);
		
		JLabel confirmpassword= new JLabel();
		confirmpassword.setText("Confirm Password:");
		f.add(confirmpassword);
		confirmpassword.setBounds(500, 405, 200, 100);
		confirmpassword.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_confpass = new JTextField();
		t_confpass.setBounds(700, 437, 200, 30);
		f.add(t_confpass);
		
		JLabel id= new JLabel();
		id.setText("ID:");
		f.add(id);
		id.setBounds(500, 450, 200, 100);
		id.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_id = new JTextField();
		t_id.setBounds(700, 482, 200, 30);
		f.add(t_id);
		
		JButton btn=new JButton("Sign Up");
		btn.setFont(new Font("Arial",Font.PLAIN,20));
		btn.setBounds(630,550,140,30);
		f.add(btn);
		
		btn.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherAfterLogin.main(new String[0]);	
				
				int t_i = Integer.parseInt(t_id.getText());
				
				
                Error er1 = Teacher.addTeacher(t_i, t_name.getText(), t_pass.getText());
				
				System.out.println(er1.flag + " " + er1.message);
				if (er1.flag) {
					JOptionPane.showMessageDialog(f, "Student Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(f, er1.message, "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				TeacherView.getIDteach(Integer.parseInt(t_id.getText()));
				
			}
		});
		
		f.setVisible(true);
     }
}
