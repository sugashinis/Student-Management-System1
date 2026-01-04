package JDBC;
import java.sql.*;

public class JDBC {

	static Statement st;

	static Connection conn;

	static {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "Joseph2002!");

			st = conn.createStatement();

		}

		catch (Exception e) {

			System.out.println(e);

		}

	}

	public static boolean add(Student student) {

		try {

			int stu_id = student.getID();

			int Teacher_id = student.getTeacher_id();

			String name = student.getName();

			if (check_1(stu_id)) {

				st.executeUpdate(
						"insert into stu_details values(" + stu_id + "," + "'" + name + "'" + "," + Teacher_id + ")");

				st.executeUpdate("insert into student_marks (stu_id) values(" + stu_id + ")");

				return true;

			}

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

	public static boolean remove(int stu_id) {

		try {

			if (!check_1(stu_id)) {

				st.executeUpdate("delete from stu_details where stu_id=" + stu_id);

				return true;

			}

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

	public static boolean addMarks(int stu_id, int[] marks) {

		try {

			if (!isStudentExist(stu_id))
				return false;

			int i = 0;

			while (i < 5) {

				st.executeUpdate("Update student_marks set m" + i + "=" + marks[i] + " where stu_id=" + stu_id);

				i++;

			}

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return true;

	}

	public static boolean addTeacher(Teacher teacher) {

		try {

			int t_id = teacher.getID();

			String name = teacher.getName();

			String psd = teacher.getPassword();

			if (!isTeacherExist(t_id)) {

				st.executeQuery("insert into teacher_details values(" + t_id + "," + name + "," + psd);

				return true;

			}

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

	public static int[] getMarks(int stu_id) {

		int result[] = new int[5];

		try {

			int i = 0;

			while (i < 5) {

				ResultSet rs = st.executeQuery("select m" + i + " from student_marks where stu_id=" + stu_id);

				rs.next();

				result[i] = rs.getInt("m" + i);

				i++;

			}

		}

		catch (Exception e) {

			System.out.println(e);

		}

		return result;

	}

	public static String[] getStudentDetails(int stu_id) {

		String[] details = new String[8];

		try {

			ResultSet rs = st.executeQuery("select name from stu_details where stu_id = " + stu_id);

			rs.next();

			details[0] = rs.getNString("name");

			details[1] = stu_id + "";

			int marks[] = getMarks(stu_id), j = 2;

			for (int i = 0; i < 5; i++) {

				details[j++] = marks[i] + "";

			}

			details[7] = Teacher.calculateCGPA(stu_id) + "";

		}

		catch (Exception e) {

			System.out.println(e);

		}

		return details;

	}

	public static String[][] getAllDetails(int t_id) {

		try {

			ResultSet rs = st.executeQuery("select count(stu_id) from stu_details");

			rs.next();
			int tot = rs.getInt(1), j = 0;

			String details[][] = new String[tot][8];
            
			ResultSet rs1 = st.executeQuery("select stu_id from stu_details");

			while (rs1.next()) {

				String temp[] = getStudentDetails(rs1.getInt(1));

				for (int i = 0; i < 8; i++) {

					details[j][i] = temp[i];

				}

				j++;

			}

			return details;

		}

		catch (Exception e) {

			System.out.println(e);

		}

		return new String[1][1];

	}

	public static boolean check_1(int stu_id) {

		try {

			String query = "select stu_id from stu_details where stu_id =" + stu_id;

			ResultSet rs = st.executeQuery(query);

			if (!rs.next())
				return true;

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

	public static boolean isStudentExist(int stu_id) {

		try {

			String query = "select stu_id from student_marks where stu_id=" + stu_id;

			ResultSet rs = st.executeQuery(query);

			if (rs.next())
				return true;

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

	public static boolean isTeacherExist(int t_id) {

		try {

			String query = "select t_id from teacher_details where t_id=" + t_id;

			ResultSet rs = st.executeQuery(query);

			if (rs.next())
				return true;

		}

		catch (Exception e) {

			System.out.println(e);

			return false;

		}

		return false;

	}

}
