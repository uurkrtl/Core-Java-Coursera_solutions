//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-programming-with-java/ungradedLab/IXfCC/creating-classes

package com.lg.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		//Exercise 1: Creating Objects
		Box box1 = new Box(7, 6, 5);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 length is + " + box1.getLength());
		System.out.println("Box 1 width is + " + box1.getWidth());
		System.out.println("Box 1 height is + " + box1.getHeight());
		System.out.println("Box 2 length is + " + box2.getLength());
		System.out.println("Box 2 width is + " + box2.getWidth());
		System.out.println("Box 2 height is + " + box2.getHeight());
		
		//Exercise 2: Test Business Methods
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		System.out.println("Length="+box1.getLength());
		System.out.println("Width="+box1.getWidth());
		System.out.println("Height="+box1.getHeight());
		
		System.out.println("Volume="+box1.getVolume());
		System.out.println("Surface Area="+box1.getSurfaceArea());
		
		box1.printBox();
		
		box1.setLength(-5);
		box1.printBox();
		
		box1.setHeight(-5);
		box1.setWidth(-5);
		
		//Challenge Exercise
		Box box3 = new Box(-2, -5, -7);
		box3.printBox();
	}
}