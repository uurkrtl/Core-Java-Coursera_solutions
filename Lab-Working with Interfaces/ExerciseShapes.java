 package com.lg.exercises;

public class ExerciseShapes {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[8];
		
		shapes[0] = new Rectangle(5.0, 4.0);
		shapes[1] = new Rectangle(5.0, 5.0);
		
		shapes[2] = new Square(5.0);
		shapes[3] = new Square(8.0);
		
		shapes[4] = new Cube(5.0);
		shapes[5] = new Cube(12.0);
		
		shapes[6] = new Box(12.0);
		shapes[7] = new Box(3.0);
		
		for(Shape shape : shapes) {
			shape.setColor("Silver");
			if (shape instanceof ThreeDimensional) {
				ThreeDimensional dimensional = (ThreeDimensional) shape;
				System.out.println(dimensional.getVolume());
				
			}
		}
		
		TwoDimensional[] twoDimensionals = new TwoDimensional[3];
		twoDimensionals[0] = new Circle(7.0);
		twoDimensionals[1] = new Rectangle(5.0, 4.0);
		twoDimensionals[2] = new Square(5.67);
		
		for(TwoDimensional dimensional : twoDimensionals) {
			System.out.println(dimensional.getArea());
			System.out.println(dimensional.getPerimeter());
		}
	}
}