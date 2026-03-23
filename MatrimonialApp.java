package com.javalogicalstatements;

import java.util.Scanner;

//WAP for a simple Java Program which can provide the possibilities
//for Marriage Matrimony console based application
public class MatrimonialApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial website ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell about Your name  : ");
		String name = sc.nextLine();
		System.out.println("Hello Mr." + name);
		
		System.out.println("Can you tell, How much Assets you have ..? ");
		double assets = sc.nextDouble();
		System.out.println("Enter your salary info : ");
		double salary = sc.nextDouble();
		
		if (assets >= 50000000.00 && salary >= 2000000.00) {
			System.out.println("Yes !! Then we can start the conversation ");
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if (age <= 28 && age >= 26) {
				System.out.println("Oh Okay !! Shall we proceed furthur !");
				
				System.out.println("Can enter your weight ..?");
				
				double weight = sc.nextDouble();
				
				if (weight <= 75 && weight >= 65) {
					System.out.println("Okay Cool !! Lets enter your Height ");
					
					float height = sc.nextFloat();
					
					if (height >= 5.4 && height <= 6.0) {
						System.out.println("Okay Good to go !!");
						
						System.out.println("Do you have sibilings..? ");
						
						boolean sibStatus = sc.nextBoolean();
						
						if (!sibStatus) {
							System.out.println("Okay !! We will get back to you soon ");
						} else {
							System.out.println("OMG !!!!!!!!!!!!!");
						}
					} else {
						System.out.println("You height is Too long or too short !! not matching with our profile ");
					}
				} else {
					System.out.println("You must Join in Gym !!");
				}
			} else {
				System.out.println("SOrry !! Your age is not matching with your profile !");
			}
		} else {
			System.out.println("You can leave for the day !! ALl the best ");
		}
	}
}
