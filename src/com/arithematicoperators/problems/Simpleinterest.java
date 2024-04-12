package com.arithematicoperators.problems;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter the principle");
		double principle = scanner.nextDouble();
//		10.021.356.4
//		double principle = 100000;
		
		System.out.println("Enter the rate of interest");
		double rate = scanner.nextDouble();
//		double rate = 12.0;
		
		System.out.println("Enter the time in years");
		int timeInYears = scanner.nextInt();
//		int timeInYears = 2;
		
		int totalInterest = (int) ((principle*timeInYears*rate)/100);
		
		System.out.println(totalInterest);

//		System.out.println(principle * rate * time / 100);

	}

}
