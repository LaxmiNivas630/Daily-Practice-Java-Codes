package com.javalogicalstatements1.loops;

import java.util.Scanner;

public class Take2PrimeNum {
	static int sum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		System.out.println("Enter b Number : ");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			isprime(i);
		}
		System.out.println(sum);
		sc.close();
	}

	static boolean isprime(int a) {
		if (a <= 1)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		sum = sum + a;
		return true;
	}
}
