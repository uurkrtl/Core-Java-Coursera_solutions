//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-programming-with-java/ungradedLab/KKl4V/creating-calculator-classes

package com.javaoo.calculators;

public class CalculatorDriver {

	public static void main(String[] args) {
		int x = 1, y = 5;
		BasicCalculator basicCalculator = new BasicCalculator();
		
		System.out.println("add 1 and 5: " + basicCalculator.add(x, y));
		System.out.println("subtract 1 and 5: " + basicCalculator.subtract(x, y));
		System.out.println("multiply 1 and 5: " + basicCalculator.multiply(x, y));
		System.out.println("divide 1 and 5: " + basicCalculator.divide(x, y));
		
		System.out.println();
		System.out.println("exp 1: " + ScientificCalculator.exp(x));
		System.out.println("log 5: " + ScientificCalculator.log(y));
		
		System.out.println();
		System.out.println("sin 1: " + TrigonometricCalculator.sine(x));
		System.out.println("cos 1: " + TrigonometricCalculator.cosine(x));
		System.out.println("tan 1: " + TrigonometricCalculator.tangent(x));
		System.out.println("arcsin 1: " + TrigonometricCalculator.arcsine(x));
		System.out.println("arccosin 1: " + TrigonometricCalculator.arccosine(x));
		System.out.println("arctangent 1: " + TrigonometricCalculator.arctangent(x));
	}
}