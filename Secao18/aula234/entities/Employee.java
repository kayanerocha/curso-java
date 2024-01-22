package entities;

// Para conseguir utilizar o método sort com objetos do tipo Employee
public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Compara dois objetos
	@Override
	public int compareTo(Employee other) {
		// - para ordernar em ordem decrescente
		return -salary.compareTo(other.getSalary());
	}

}
