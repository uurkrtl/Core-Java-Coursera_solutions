//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-programming-with-java/ungradedLab/IXfCC/creating-classes

package com.lg.exercises;

public class Box {
	//Exercise 1: Creating Classes and Attributes
	private double height;
	private double width;
	private double length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	//Exercise 2: Create Constructors
	public Box(double height, double width, double length) {
		super();
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
			System.out.printf("Length = %d%nWidth = %d%nHeight = %d%nVolume = %d%nSurface Area = %d", length, width, height, this.getVolume(), this.getSurfaceArea());
		}
	}

}