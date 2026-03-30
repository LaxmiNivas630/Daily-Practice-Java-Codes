package com.javalogicalstatements1.loops;

import java.util.Scanner;

//WAP to print the math table from 0 to 20 based on Given number...?
//input is : 9
//output is : 9 x 1 =9
public class MathTable {

	public static void main(String[] args) {

		System.out.println("Main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println("Enter upto where you want to print :");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		}
	}

}
