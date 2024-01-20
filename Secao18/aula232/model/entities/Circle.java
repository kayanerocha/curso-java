package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
	
	private double radius;

	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius * Math.PI;
	}

}
