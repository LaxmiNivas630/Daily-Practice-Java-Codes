package com.javalogicalstatements1.loops.Dowhileloop;

import java.util.Scanner;

public class HappyNumber {

	static int FindHappyNum(int n) {
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r;
		}
		System.out.println(sum);
		if (sum == 1) {
			return sum;

		} else {
			return FindHappyNum(sum);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int n1 = FindHappyNum(n);

		if (n == 1) {
			System.out.println("This is a Happy number ");

		} else {
			System.out.println("This is not a Happy Number ");
		}

	}

}
