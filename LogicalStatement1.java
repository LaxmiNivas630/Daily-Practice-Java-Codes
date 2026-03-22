package com.javalogicalstatements;

import java.util.Scanner;

//WAP to find the Grade based on your marks..?
public class LogicalStatement1 {

	public static void main(String[] args) {

		System.out.println("main method Started ! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks percentage : ");

		double marksP = sc.nextDouble();

		if (marksP > 100 || marksP < 0) {
			System.out.println("Invalid marks Percentage !!");
		} else if (marksP >= 90) {
			System.out.println("Grade A");
		} else if (marksP >= 80) {
			System.out.println("Grade B");
		} else if (marksP >= 70) {
			System.out.println("Grade C");
		} else if (marksP >= 60) {
			System.out.println("Grade D");
		} else if (marksP >= 35) {
			System.out.println("Just passed");
		} else {
			System.out.println("Failed");
		}

		sc.close();
	}

}
