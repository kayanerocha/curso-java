package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Aula232 {
	
	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(2.0, Color.BLACK);
		AbstractShape s2 = new Rectangle(3.0, 4.0, Color.WHITE);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
		
	}

}
