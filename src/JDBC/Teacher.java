package JDBC;

import java.util.*;

public class Teacher extends User {

	public static String Password;

	public static Error addTeacher(int id, String name, String psd) {

		ID = id;

		Name = name;

		Password = psd;

		boolean flag = Validation.ID(id).flag & Validation.Name(name).flag & Validation.Password(psd).flag & JDBC.isTeacherExist(id);

		if (flag == true) {
			return new Error(false, "Invalid Teacher ID");
		} else {
			return new Error(true, "");
		}

	}

	public String getPassword() {

		return Teacher.Password;

	}

	public static Error addStudent(String name, int id, int t_id) {

		Error ob1 = Validation.ID(id);

		if (ob1.flag == true) {
			return ob1;
		}

		Error ob2 = Validation.Name(name);

		if (ob2.flag == true) {
			return ob2;
		}

		Error ob3 = Validation.ID(t_id);

		if (ob3.flag == true) {
			return ob3;
		}

		Student st = new Student(name, id, t_id);

		boolean result = JDBC.add(st);

		if (result) {

			return new Error(result, "");

		} else {

			return new Error(result, "User already Exists");

		}

	}

	public static Error removeStudent(int id) {

		boolean result = JDBC.remove(id);

		if (result) {

			return new Error(result, "");

		} else {

			return new Error(result, "No Students with the given ID");
		}

	}

	public static Error addmarks(int s_id, int[] arr) {

		boolean val = Validation.Mark(arr).flag && Validation.ID(s_id).flag && JDBC.isStudentExist(s_id);

		if (val == false)
			return new Error(true, "Check the Entered Student ID");

		boolean res = JDBC.addMarks(s_id, arr);

		if (res == true)
			return new Error(res, "");
		else
			return new Error(res, "Error in the Database Connection");

	}

	public static float calculateCGPA(int s_id) {

		int total = 0;

		int[] credit = { 1, 1, 1, 1, 1 };

		int[] marks = JDBC.getMarks(s_id);

		for (int i = 0; i < 5; i++) {

			total += (credit[i] * marks[i]);

		}

		float ans = total / 50f;

		return ans;

	}

	public static String[] viewStudentDetails(int s_id) {

		String[] res = JDBC.getStudentDetails(s_id);

		return res;

	}

	public static String[][] viewAllStudents(int t_id) {
		
		String[][] res = JDBC.getAllDetails(t_id);
		
		return res;
	}
}