package com.javalogicalstatements1.loops;

public class CountOfEvenAndOdd {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		int evensum = 0;
		int oddsum = 0;

		System.out.println("Sum of Even and Odd Numbers : ");

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;

			}
			if (i % 2 != 0) {
				oddsum = oddsum + i;

			}

		}

		System.out.println(evensum + " ");
		System.out.print(oddsum + " ");

	}

}
