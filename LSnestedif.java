package com.javalogicalstatements;

import java.util.Scanner;

public class LSnestedif {

	public static void main(String[] args) {
		System.out.println("main method ended !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age ..");
		int age = sc.nextInt();

		System.out.println("Do you Have License...");
		boolean hasLicense = sc.nextBoolean();

		if (age > 18) {
			if (hasLicense) {

				System.out.println("r u Indian ..?");
				boolean areYouIndian = sc.nextBoolean();

				if (areYouIndian) {
					System.out.println("you are eligible Driving !");
				} else {
					System.out.println("your age & License is good to go but you dont hava a Citizenship !!");
				}

			} else {
				System.out.println("your age is okay to proceed but you must need to provide the Lincense !!");
			}
		} else {
			System.out.println("you are eligible Driving !");
		}
	}

}
