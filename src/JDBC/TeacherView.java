package JDBC;
import java.awt.*;
import java.util.Arrays;

import javax.swing.*;
public class TeacherView {
	static int teach_id;
    static void getIDteach(int t_id)
    {
    	teach_id = t_id;
    	return;
    }
	public static void main(String[] args) {
		//String[][] det = {{"Karthick","20EUCS059","100","100","100","100","100","10"},{"Akash", "20EUCS005", "100", "100", "100", "100","100", "10"},{"Ram","20EUEC121","100","100","100","100","100","10"}};
		String[][] det = Teacher.viewAllStudents(teach_id);
		System.out.print(Arrays.toString(det[0]));
		JFrame f = new JFrame();
		f.setSize(1920, 1080);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Students Record");
		
		TeacherView.viewDetails(det,f);
		
	}
	static void createLine(String[] detail, int x, int y,JFrame f)
	{
		try {
		System.out.println(Arrays.toString(detail));
		JLabel namef = new JLabel(detail[0]);
		namef.setBounds(x, y, 400, 30);
		namef.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(namef);
		

		JLabel registerf = new JLabel(detail[1]);
		registerf.setBounds(x+100, y, 400, 30);
		registerf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(registerf);
		
		JLabel osf = new JLabel(detail[2]);
		osf.setBounds(x+230, y, 400, 30);
		osf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(osf);
		
		JLabel javaf = new JLabel(detail[3]);
		javaf.setBounds(x+300, y, 400, 30);
		javaf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(javaf);
		
		JLabel dbmsf = new JLabel(detail[4]);
		dbmsf.setBounds(x+370, y, 400, 30);
		dbmsf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(dbmsf);
		
		JLabel dsf = new JLabel(detail[5]);
		dsf.setBounds(x+460, y, 400, 30);
		dsf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(dsf);
		
		JLabel cnf = new JLabel(detail[6]);
		cnf.setBounds(x+510, y, 400, 30);
		cnf.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(cnf);
		
		JLabel cgpaf=new JLabel(detail[7]);
		cgpaf.setBounds(x+560,y,400,30);
		cgpaf.setFont(new Font("Arial",Font.PLAIN,15));
		f.add(cgpaf);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void viewDetails(String[][] details,JFrame f)
	{
		
		
		JLabel namef = new JLabel("Name");
		namef.setBounds(370, 100, 400, 30);
		namef.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(namef);
		

		JLabel registerf = new JLabel("Register No");
		registerf.setBounds(460, 100, 400, 30);
		registerf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(registerf);
		
		JLabel osf = new JLabel("OS");
		osf.setBounds(600, 100, 400, 30);
		osf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(osf);
		
		JLabel javaf = new JLabel("Java");
		javaf.setBounds(670, 100, 400, 30);
		javaf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(javaf);
		
		JLabel dbmsf = new JLabel("DBMS");
		dbmsf.setBounds(740, 100, 400, 30);
		dbmsf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(dbmsf);
		
		JLabel dsf = new JLabel("DS");
		dsf.setBounds(830, 100, 400, 30);
		dsf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(dsf);
		
		JLabel cnf = new JLabel("CN");
		cnf.setBounds(880, 100, 400, 30);
		cnf.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(cnf);
		
		JLabel cgpaf=new JLabel("CGPA");
		cgpaf.setBounds(920,100,400,30);
		cgpaf.setFont(new Font("Arial",Font.PLAIN,20));
		f.add(cgpaf);
		
		int y = 150;
		for(int i = 0; i < details.length; i++) {
			//System.out.println(details[i]);
			TeacherView.createLine(details[i], 370, y, f);
			y += 50;
		}
		
		f.setVisible(true);
	}
	
}