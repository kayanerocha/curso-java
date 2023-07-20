package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		Employee employee = employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		if (employee != null) {
			System.out.print("Enter the porcentage: ");
			double percentage = sc.nextDouble();
			employee.increase(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		if (emp != null) {
			return true;
		}
		return false;
	}

}
