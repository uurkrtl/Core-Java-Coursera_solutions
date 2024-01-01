package com.lg.exercises;

public class Box extends Shape implements ThreeDimensional {
	//Exercise 1: Creating Classes and Attributes
	private double height;
	private double width;
	private double length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height<=0) {
			System.out.println("Height must be greater than 0");
		}else {
			this.height = height;
		}
			
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width<=0) {
			System.out.println("Width must be greater than 0");
		}else {
			this.width = width;
		}
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length<=0) {
			System.out.println("Length must be greater than 0");
		}else {
			this.length = length;
		}
	}
	
	//Exercise 2: Create Constructors
	public Box(double height, double width, double length) {
		super();
		if (height<=0) height=1;
		if (width<=0) width=1;
		if (length<=0) length=1;
		
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public Box(double side) {
		this(side, side, side);
	}
	
	//Exercise 3: Create Business Methods
	public double getVolume () {
		return height * width * length;
	}
	
	public double getSurfaceArea () {
		return (length * width + length * height + width * height) * 2;
	}
	
	//Exercise 4: Create a printBox Method
	public void printBox () {
		if (height<=0 || width<=0 || length<=0) {
			System.out.println("You entered an invalid value");
		}else {
			System.out.printf("Length = %.1f%nWidth = %.1f%nHeight = %.1f%nVolume = %.1f%nSurface Area = %.1f%n", length, width, height, this.getVolume(), this.getSurfaceArea());
		}
	}
}