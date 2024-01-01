package com.lg.exercises;

public class Rectangle extends Shape implements TwoDimensional {
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		super.setName("Unknown");
		super.setColor("White");
	}
	
	public Rectangle(double length, double width, String name, String color) {
		this.length = length;
		this.width = width;
		super.setName(name);
		super.setColor(color);
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return (length + width) * 2;
	}
	
	
}