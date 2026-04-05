package com.javalogicalstatements1.loops1;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Main method Started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int r = 0;
		String rev = " ";

		while (n != 0) {
			r = n % 2;
			n = n / 2;
			rev = r + rev;
		}
		System.out.println("Binary number of a Given number is : " + rev);
		System.out.println("Main method ended !!");
	}

}
