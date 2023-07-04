package util;

public class Calculator {
	
	/*
	 *  final indica que é constante e não muda
	 *  é o mesmo valor indenpendete de objeto Calculator
	 */
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
