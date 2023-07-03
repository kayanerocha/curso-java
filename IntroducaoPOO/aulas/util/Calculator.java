package util;

public class Calculator {
	
	// final indica que é constante e não muda
	public final double PI = 3.14159;
	
	// Precisa ser estático, pois o main não permite chamar um método que não é estático
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
