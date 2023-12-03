//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-programming-with-java/ungradedLab/KKl4V/creating-calculator-classes

package com.javaoo.calculators;

public class ScientificCalculator {
	public static final double PI =  3.14159;
	private double holdValue;
	
	public static final double exp(double x) {
		return Math.exp(x);
	}
	
	public static final double log(double x) {
		return Math.log(x);
	}
	
	public final void putValueInMemory(double x) {
		this.holdValue = x;
	}
	
	public final double getValueFromMemory() {
		return(this.holdValue);
	}
}