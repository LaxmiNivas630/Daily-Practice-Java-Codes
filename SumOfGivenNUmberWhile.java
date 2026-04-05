package com.javalogicalstatements1.loops1;

import java.util.Scanner;

public class SumOfGivenNUmberWhile {

	public static void main(String[] args) {
		System.out.println("Main methd started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;

		}
		System.out.println("Sum of a given Number : " + sum);

	}

}
