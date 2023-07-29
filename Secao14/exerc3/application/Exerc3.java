package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Exerc3 {
	
	/*
	 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois as áreas destas figuras na mesma ordem em que foram
	 * digitadas.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("Shape #" + i + " data:%n");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String colorName = sc.nextLine();
			Color color = Color.valueOf(colorName);
			
			if (shape == 'r') {
				System.out.print("Widht: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape s : list) {
			System.out.printf("%.2f%n", s.area());
		}
		
		sc.close();
	}

}
