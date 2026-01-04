package JDBC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainLogin {
	public static void main(String[] args) {
		//This is the frame which is displayed when the app is invoked
		JFrame f = new JFrame();
		f.setSize(1920, 1080);
		f.setLayout(null);
		f.setTitle("Student management System");
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		//Close the frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//This is used to show the heading
		JLabel l = new JLabel();
		l.setText("LOGIN");
		f.add(l);
		l.setBounds(625, 100, 100, 100);
		l.setFont(new Font("Arial", Font.BOLD, 30));
		
		// Buttons for Teacher Login
		JButton btnTeacher = new JButton("Teacher Login");
		btnTeacher.setFont(new Font("Arial", Font.PLAIN, 20));
		btnTeacher.setBounds(475, 270, 400, 75);
		f.add(btnTeacher);
		
		btnTeacher.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherLogin.main(new String[0]);				
			}
		});
		
		// Buttons for Student Login
		JButton btnStudent = new JButton("Student Login");
		btnStudent.setFont(new Font("Arial", Font.PLAIN, 20));
		btnStudent.setBounds(475, 400, 400, 75);
		f.add(btnStudent);
		
		btnStudent.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLogin.main(new String[0]);				
			}
		});
	}
}