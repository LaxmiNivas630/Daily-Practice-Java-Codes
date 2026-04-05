package com.javalogicalstatements1.loops1;

//WAP to print the Reverse number of a Given Number ...?
import java.util.Scanner;

public class ReverseNumberOFGivenNumber {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;

		}
		System.out.println("Reverse number of a Given Number : " + rev);

	}

}
