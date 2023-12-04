//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-hierarchies-java/ungradedLab/tTmwy/working-with-inheritance

package com.lg.exercises;

//Exercise 1: Using the extends keyword
public class Cube extends Box {
	
	public Cube(double side) {
		super(side);
	}
	
	@Override
	public void setHeight (double height) {
		if (height != super.getHeight()) {
			super.setHeight(height);
			super.setLength(height);
			super.setWidth(height);
		}
	}
	
	@Override
	public void setLength (double length) {
		if (length != super.getHeight()) {
			super.setHeight(length);
			super.setLength(length);
			super.setWidth(length);
		}
	}
	
	@Override
	public void setWidth (double width) {
		if (width != super.getHeight()) {
			super.setHeight(width);
			super.setLength(width);
			super.setWidth(width);
		}
	}
	
	//Exercise 2: Adding Functionality to Cube
	public void setSide (double side) {
		if (side<=0) {
			System.err.println("All sides must be greater than 0");
		}else {
			super.setHeight(side);
			super.setLength(side);
			super.setWidth(side);
		}
	}
	
	public double getSide () {
		return super.getHeight();
	}
}