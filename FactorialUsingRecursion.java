package com.javalogicalstatements1.loops;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static int findFact(int n) {
		if (n == 1) {
			return 1;

		}
		return n * findFact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();// 4 3 2 1
		int ft = findFact(n);
		sc.close();
		System.out.println("Factorial of a Given Number is :" + ft);

	}

}
