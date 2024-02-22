package application;

import java.util.Scanner;

import entities.Course;
import entities.Instructor;
import entities.User;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Course a = new Course("A");
		Course b = new Course("B");
		Course c = new Course("C");
		
		Instructor instructor = new Instructor(1, "Alex");
		instructor.getCourses().add(a);
		instructor.getCourses().add(b);
		instructor.getCourses().add(c);
		
		for (Course course : instructor.getCourses()) {
			System.out.print("How many students for course " + course.getName() + ": ");
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				int code = sc.nextInt();
				course.getStudents().add(new User(code));
			}
		}
		
		System.out.println("Total students: " + instructor.getStudents().size());
		
		sc.close();

	}

}
