//Created by Ugur Kartal
//https://www.coursera.org/learn/java-introduction/ungradedLab/w5iFt/flow-control

package com.lg.exercises;

public class Lab3 {

	public static void main(String[] args) {
		// Exercise 1: for loop
		System.out.println("Day of week:");
		
		String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		for (String day : dayOfWeek) {
			System.out.println(day);
		}
		
		System.out.println("\nDay of week **Reverse**:");
		for (int i = dayOfWeek.length-1; 0<=i; i--) {
			System.out.println(dayOfWeek[i]);
		}
		
		// Exercise 2: while loop and continue
		System.out.println("\nEven numbers between 1 and 20:");
		
		int number = 0;
		while (number<=20) {
			number++;
			if (number%2 == 1) continue;
			System.out.println(number);
		}
		
		//Exercise 3: for loop
		System.out.println("\nAll numbers between 1 and 100 except 50 thru 60");
		for (int i = 1; i<=100; i++) {
			if (i >= 50 && i <= 60) continue;
			System.out.print(i + " ");
		}
		
		//Exercise 4: switch statement
		System.out.println("\nNumber of days in each of the months of the year");
		
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int loopNumber = 1;
		while (loopNumber<=12) {
			switch ((loopNumber == 1 || loopNumber == 3 || loopNumber == 5 || loopNumber == 7 || loopNumber == 8 || loopNumber == 10 || loopNumber == 12) ? 0 : loopNumber) {
			case 0: {
				System.out.println(monthNames[loopNumber-1] + ": 31");
				break;
			}
			case 2: {
				System.out.println(monthNames[loopNumber-1] + ": 28");
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				System.out.println(monthNames[loopNumber-1] + ": 30");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: Month number");
			}
			loopNumber++;
		}
		
		//Challenge Exercise
		
		System.out.println("\nStart of output Challenge Excercise");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.print("                    ");
		int dayNumber = 1, colNumber = 6;
		while (dayNumber<=31) {
			System.out.print(dayNumber<10 ? dayNumber + "   " : dayNumber + "  ");
			colNumber++;
			if (colNumber>7) {
				System.out.println();
				colNumber = 1;
			}
			dayNumber++;
		}
	}
}