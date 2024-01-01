package com.lg.exercises;

import static java.lang.Math.PI;

public class Circle extends Shape implements TwoDimensional {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
		super.setName("Unknown");
		super.setColor("White");
	}
	
	public Circle(double radius, String color, String name) {
		this.radius = radius;
		super.setColor(color);
		super.setName(name);
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}