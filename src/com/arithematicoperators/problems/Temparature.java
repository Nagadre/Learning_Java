package com.arithematicoperators.problems;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit ");
		double tempInFarenheit = scanner.nextDouble();
		double celsius = ((tempInFarenheit-32)/1.8);
		System.out.println("Temperature in Celsius = "+celsius);
		
		
//		int fahrenheit = 145;
//		int Celsius = 70;
		// C= (F-32)/1.8

	}

}
