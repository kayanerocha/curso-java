package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor extends User {
	
	private String name;
	
	private List<Course> courses = new ArrayList<>();

	public Instructor(int code, String name) {
		super(code);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public Set<User> getStudents() {
		Set<User> students = new HashSet<>();
		for (Course c : this.courses) {
			for (User u : c.getStudents()) {
				students.add(u);
			}
		}
		
		return students;
	}

}
