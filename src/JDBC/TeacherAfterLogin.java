package JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TeacherAfterLogin{
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
		l.setText("Welcome");
		f.add(l);
		l.setBounds(625, 100, 200, 100);
		l.setFont(new Font("Arial", Font.BOLD, 30));
		
		// Buttons for adding marks
		JButton bmark = new JButton("Add marks");
		bmark.setFont(new Font("Arial", Font.PLAIN, 20));
		bmark.setBounds(250, 250, 350, 75);
		f.add(bmark);
		
		bmark.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMark.main(new String[0]);				
			}
		});
		
		// Buttons for Updating marks
		JButton bumark = new JButton("Update marks");
		bumark.setFont(new Font("Arial", Font.PLAIN, 20));
		bumark.setBounds(750, 250, 350, 75);
		f.add(bumark);
		
		bumark.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateMarks.main(new String[0]);				
			}
		});
		
		// Buttons for Adding new Student
		JButton badds = new JButton("Add student");
		badds.setFont(new Font("Arial", Font.PLAIN, 20));
		badds.setBounds(100, 400, 350, 75);
		f.add(badds);
		
		badds.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(new String[0]);				
			}
		});
				
		// Buttons for Removing Student
		JButton brems = new JButton("Remove student");
		brems.setFont(new Font("Arial", Font.PLAIN, 20));
		brems.setBounds(500, 400, 350, 75);
		f.add(brems);
		
		brems.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveStudent.main(new String[0]);				
			}
		});
		// Buttons for viewing details
		JButton bvd = new JButton("View details");
		bvd.setFont(new Font("Arial", Font.PLAIN, 20));
		bvd.setBounds(900, 400, 400, 75);
		f.add(bvd);
		
		bvd.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherView.main(new String[0]);				
			}
		});
	}
}