package com.javalogicalstatements1.loops;

import java.util.Scanner;

public class Factorial1 {

	static int findFact(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;

		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();// 4 3 2 1
		int fact = findFact(n);
		sc.close();
		System.out.println("Factorial of a Given Number is :" + fact);

	}

}
