package com.javalogicalstatements1.loops;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int n = sc.nextInt();

		String s = Integer.toString(n);
		int count = s.length();

		int r = 0;
		int temp = n;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;

			sum = (int) (sum + Math.pow(r, count));
		}
		if (sum == temp) {
			System.out.println("Given number is ArmStrong ");
		} else {
			System.out.println("Given number is not  Armstrong ");
		}
		sc.close();
	}

}
