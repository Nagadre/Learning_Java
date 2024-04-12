package com.arithematicoperators.problems;

import java.util.Scanner;

public class Ageinseconds {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the age in years");
	
	int age = scanner.nextInt();
	/*
	 * 1 year = 365 days
	 * 1 day = 24 hours
	 * 1 hour = 60 mins
	 * 1 min = 60 seconds
	 * 
	 * 1 hour = 60*60
	 * 1 day = 24*60*60
	 * 1 year = 365*24*60*60;
	 * 20 years = 20*365*24*60*60;
	 */
	int ageInSeconds = age*(365*24*60*60);
	System.out.println(ageInSeconds);
	
	
	
	}

}
