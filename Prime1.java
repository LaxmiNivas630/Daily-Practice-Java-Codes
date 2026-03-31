package com.javalogicalstatements1.loops;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");

		int n = sc.nextInt();
		boolean status = true;
		
		if(n==0 || n==1) {
			status=false;
		}

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				status = false;
				break;

			}
		}

		if (status) {
			System.out.println("The given number is Prime !");
		} else {
			System.out.println("The given number is not a prime !");
		}
	}

}
