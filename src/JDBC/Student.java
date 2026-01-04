package JDBC;

public class Student extends User {
	
	public int Teacher_ID;

	public Student(String name, int id, int t_id) {
		
		ID = id;
		
		Name = name;
		
		Teacher_ID = t_id;
	}

	public int getTeacher_id() {
		
		return Teacher_ID;
	}
}


