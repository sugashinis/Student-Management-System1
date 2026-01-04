package JDBC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddStudent {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setSize(1920, 1080);
		f.setTitle("Add Student");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l = new JLabel();
		l.setText("Add Student");
		f.add(l);
		l.setBounds(680, 100, 200, 100);
		l.setFont(new Font("Arial", Font.BOLD, 30));

		JLabel name = new JLabel();
		name.setText("Name:");
		f.add(name);
		name.setBounds(560, 260, 200, 100);
		name.setFont(new Font("Arial", Font.PLAIN, 22));

		JTextField t_name = new JTextField();
		t_name.setBounds(760, 295, 200, 30);
		f.add(t_name);

		JLabel regno = new JLabel();
		regno.setText("Register No:");
		f.add(regno);
		regno.setBounds(560, 310, 200, 100);
		regno.setFont(new Font("Arial", Font.PLAIN, 22));

		JTextField t_reg_no = new JTextField();
		t_reg_no.setBounds(760, 342, 200, 30);
		f.add(t_reg_no);

		JLabel teacher_id = new JLabel();
		teacher_id.setText("Teacher Id:");
		f.add(teacher_id);
		teacher_id.setBounds(560, 360, 200, 100);
		teacher_id.setFont(new Font("Arial", Font.PLAIN, 22));

		JTextField t_teacher_id = new JTextField();
		t_teacher_id.setBounds(760, 392, 200, 30);
		f.add(t_teacher_id);

		JButton btn = new JButton("Add");
		btn.setFont(new Font("Arial", Font.PLAIN, 20));
		btn.setBounds(690, 470, 140, 30);
		f.add(btn);

		f.setVisible(true);

		// event listeners
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t_name.getText();
				int stu_id = Integer.parseInt(t_reg_no.getText());
				int t_id = Integer.parseInt(t_teacher_id.getText());
				System.out.println(str + " " + (stu_id) + " " + (t_id));
				Error er1 = Teacher.addStudent(str, stu_id, t_id);
				System.out.println(er1.flag + " " + er1.message);
				if (er1.flag) {
					JOptionPane.showMessageDialog(f, "Student Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(f, er1.message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}