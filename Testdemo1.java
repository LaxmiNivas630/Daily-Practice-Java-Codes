package com.javalogicalstatements1;

import java.util.Scanner;

public class Testdemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum += i;
		}

		System.out.println("sum is = " + sum);

	}

}
