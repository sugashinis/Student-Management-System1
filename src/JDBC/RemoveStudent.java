package JDBC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RemoveStudent {
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		f.setSize(1920,1080);
		f.setTitle("Remove Student");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JLabel l=new JLabel();
	    l.setText("Remove Student");
	    f.add(l);
	    l.setBounds(660,100,500,100);
	    l.setFont(new Font("Arial",Font.BOLD,30));
		
		JLabel r_regno = new JLabel();
		r_regno.setText("Register No:");
		f.add(r_regno);
		r_regno.setBounds(560, 260, 200, 100);
		r_regno.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_rreg_no = new JTextField();
		t_rreg_no.setBounds(760, 295, 200, 30);
		f.add(t_rreg_no);
		
		JLabel r_teacher_id= new JLabel();
		r_teacher_id.setText("Teacher Id:");
		f.add(r_teacher_id);
		r_teacher_id.setBounds(560, 310, 200, 100);
		r_teacher_id.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JTextField t_rteacher_id = new JTextField();
		t_rteacher_id.setBounds(760, 342, 200, 30);
		f.add(t_rteacher_id);
		
		JButton btn=new JButton("Remove");
		btn.setFont(new Font("Arial",Font.PLAIN,20));
		btn.setBounds(690,440,140,30);
		f.add(btn);
		
		f.setVisible(true);
		
		//event listeners
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						int stu_id = Integer.parseInt(t_rreg_no.getText());
						
						System.out.println(stu_id);
						
						Error er1 = Teacher.removeStudent(stu_id);
						
						System.out.println(er1.flag + " " + er1.message);
						if (er1.flag) {
							JOptionPane.showMessageDialog(f, "Student Removed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(f, er1.message, "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
     }
}
