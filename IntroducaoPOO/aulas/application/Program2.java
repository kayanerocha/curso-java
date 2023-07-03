package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	
	/*
	 * Versão 1: Métodos na própria classe do programa
	 * Nota: dentro de um método estático não é possível chamar membros de instância da mesma classe
	 * Na mesma classe não pode chamar dentro de um método estático um método não estático
	 */
	
	// final indica que é constante e não muda
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();

	}
	
	// Precisa ser estático, pois o main não permite chamar um método que não é estático
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
