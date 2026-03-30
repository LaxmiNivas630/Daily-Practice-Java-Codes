package com.javalogicalstatements1.loops;

//WAP to print sum of all the numbers using for loop like print sum of first 10 numbers
//WAP to print product  of all the numbers using for loop like print product of first 10 numbers
public class SumAndProductOfAllTheFirstNumbers {

	public static void main(String[] args) {
		System.out.println("Main method Started !!");

		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum = sum * i;// 55
		}
		System.out.println("Product  of all the values : " + sum);
		
		System.out.println("Main method ended !!!");
	}

}
