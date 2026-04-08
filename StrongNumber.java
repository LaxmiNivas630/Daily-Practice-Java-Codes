package com.javalogicalstatements1.loops.Dowhileloop;

import java.util.Scanner;

public class StrongNumber {
	static int strongnum(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + strongnum(r);

		}
		System.out.println(sum);
		System.out.println(n);

		if (sum == temp) {
			System.out.println("This is a Strong number ");

		} else {
			System.out.println("This is not a Strong Number ");
		}

	}

}
