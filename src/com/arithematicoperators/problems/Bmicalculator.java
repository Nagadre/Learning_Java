package com.arithematicoperators.problems;

import java.util.Scanner;

public class Bmicalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter The Weight");
		double weight = scanner.nextDouble();
		
	//	double weight = 85.2;
		
		System.out.println("Enter the height");
		double height = scanner.nextDouble();
		// double height = 5.5;
		
		System.out.println(weight/height*height);
		double bmi = weight/height*height;
		
		if (bmi<=18.5) {
			System.out.println("underweight");	
		}
		if ((bmi>=18.5)&&(bmi<=24.9)) {
			System.out.println("Normal Weight");
		}
		if(bmi>=25) {
			System.out.println("Over Weight");
		}
			
		
	}

}
