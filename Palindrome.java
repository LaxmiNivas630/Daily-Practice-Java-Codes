package com.javalogicalstatements1.loops1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Main method started ! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		System.out.println(" Reverse Number of a Given Number is : " + rev);

		if (temp == rev) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}
		System.out.println("main method ended !!");

	}

}
