package com.javalogicalstatements1.loops1;

import java.util.Scanner;

//WAP to find the count of given number..?
//input : 123
//Output : 3
public class CountOfGivenNumber {

	public static void main(String[] args) {
		System.out.println("Main method started  !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();//123
		int r = 0;
		int count = 0;

		while (n != 0) {
			r = n % 10;// 123%10 = 3 ---->12%10 = 2 ----> 1%10 = 1------->Remainder
			n = n / 10;// 123/10 = 12 --->12/10 =1 --->1/10 =0 ------->Quotient
			count++;

		}
		System.out.println("Count of given number is : " + count);
		System.out.println("Main method ended!!");
	}

}
