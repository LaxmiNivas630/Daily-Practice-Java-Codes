package com.javalogicalstatements1.loops;

import java.util.Scanner;

//WAp to print sum of all the numbers 
//using for loop like print sum of first 10 numbers..?
public class SumAllOfTheNumbers {

	public static void main(String[] args) {
		System.out.println("Main method Started ! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}

		if (sum == n) {
			System.out.println("The given Number is perfect ");
		} else {
			System.out.println("The given Number is not  perfect ");
		}
		System.out.println(n);
	}

}
