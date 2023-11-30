//Created by Ugur Kartal
//https://www.coursera.org/learn/java-introduction/ungradedLab/HnE8h/using-primitive-data-types

package com.lg.exercises;

public class Lab2 {
	
	public static void main(String[] args) {
		// Define Primitive Data Types
		int width;
		int height;
		int area;
		double radius = 10.0;
		double pi = 3.14;
		boolean result = true;
		width = 8;
		height = 12;
		area = 96;
		System.out.println("The value of width is " + width);
		System.out.println("The value of height is " + height);
		System.out.println("The value of area is " + area);
		System.out.println("The value of radius is " + radius);
		System.out.println("The value of pi is " + pi);
		System.out.println("The value of result is " + result);
		
		//Define Arrays
		System.out.println();
		int[] daysInMonths = new int[12];
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		daysInMonths[0] = 31;
		daysInMonths[1] = 28;
		daysInMonths[2] = 31;
		daysInMonths[3] = 30;
		daysInMonths[4] = 31;
		daysInMonths[5] = 30;
		daysInMonths[6] = 31;
		daysInMonths[7] = 31;
		daysInMonths[8] = 30;
		daysInMonths[9] = 31;
		daysInMonths[10] = 30;
		daysInMonths[11] = 31;
		
		for (int i = 0; i<daysInMonths.length;i++) {
			System.out.println(monthNames[i] + " has " + daysInMonths[i] + " days.");
		}
	}	
}