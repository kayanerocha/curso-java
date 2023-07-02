package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String status() {
		double finalGrade = finalGrade();
		if (finalGrade >= 60.00) {
			return "PASS";
		}
		return "FAILED \nMISSING " + String.format("%.2f", 60.00 - finalGrade) + " POINTS";
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + status();
	}

}
