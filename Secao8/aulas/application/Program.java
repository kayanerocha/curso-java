package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	// Aula 1: Resolvendo um problema sem orientação a objetos
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double xArea = x.area();
		double yArea = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", xArea);
		System.out.printf("Triangle Y area: %.4f\n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}
