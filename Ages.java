package com.javalogicalstatements;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");

		int age = sc.nextInt();

		if (age < 0 ) {
			System.out.println("Invalid age");
		} else if (age <= 5) {
			System.out.println("Child");

		} else if (age <= 12) {
			System.out.println("Kid");
		} else if (age <= 19 ) {
			System.out.println("Teen");
		} else if (age <= 35 ) {
			System.out.println("young");
		} else if (age <= 59) {
			System.out.println("Middle age");
		} else {
			System.out.println("old age");
		}
		
	}

}
