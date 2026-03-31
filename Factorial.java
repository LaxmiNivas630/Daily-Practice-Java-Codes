package com.javalogicalstatements1.loops;

import java.util.Scanner;

//WAP to find factorial of a Given number using for loop ..?
//input is : 4
//output is : 4! = 4*3*2*1
public class Factorial {

	public static void main(String[] args) {
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();// 4 3 2 1
		sc.close();

		for (int i = n; i >= 1; i--) {
			fact = fact * i;

		}

		System.out.println("Factorial of a Given Number is :" + fact);
	}

}
