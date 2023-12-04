//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-hierarchies-java/ungradedLab/tTmwy/working-with-inheritance

package com.lg.exercises;

public class CubeDriver {

	public static void main(String[] args) {
		//Exercise 3: Try out the Cube class
		Cube cube1 = new Cube(5);
		Cube cube2 = new Cube(8);
		
		System.out.println("Cube 1 length is " + cube1.getLength());
		System.out.println("Cube 1 width is " + cube1.getWidth());
		System.out.println("Cube 1 height is " + cube1.getHeight());
		
		System.out.println();
		System.out.println("Cube 2 length is " + cube2.getLength());
		System.out.println("Cube 2 width is " + cube2.getWidth());
		System.out.println("Cube 2 height is " + cube2.getHeight());
		
		System.out.println();
		cube1.setLength(20);
		cube1.printBox();
		
		System.out.println();
		cube1.setSide(40);
		cube1.printBox();
		
	}
}
