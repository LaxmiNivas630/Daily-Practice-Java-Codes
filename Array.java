package com.javalogicalstatements.Arrays;

public class Array {

	public static void main(String[] args) {
		System.out.println("Main method started !");

//	Declaration
		int[] ages;

//	Object creation
		ages = new int[5];// 0 1 2 3 4

//	initialization 
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 24;
		ages[4] = 25;

//	Representation 
//	System.out.println(ages[0]);
//	System.out.println(ages[1]);
//	System.out.println(ages[2);
//	System.out.println(ages[3]);
//	System.out.println(ages[4]);

//	Representation with for loop

		for (int i = 0; i < ages.length; i++) {

			System.out.println(ages[i]);
		}

	}

}
