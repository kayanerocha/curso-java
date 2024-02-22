package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
	
	private String name;
	
	private Set<User> students = new HashSet<>();

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getStudents() {
		return students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(students, other.students);
	}

}
