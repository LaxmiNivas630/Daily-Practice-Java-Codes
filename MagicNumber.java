package com.javalogicalstatements1.loops.Dowhileloop;

import java.util.Scanner;

public class MagicNumber {
	static int FindMag(int n) {
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println(sum);
		if (sum == 1) {
			return sum;

		} else {
			return FindMag(sum);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int n1 = FindMag(n);

		if (n == 1) {
			System.out.println("This is a magic number ");

		} else {
			System.out.println("This is not a magic Number ");
		}

	}

}
