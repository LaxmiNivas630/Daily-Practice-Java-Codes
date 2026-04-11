package com.javalogicalstatements.Arrays;

//2D Array
public class TwoDimensionalArray {

	public static void main(String[] args) {
		System.out.println("Main method Started !");

		int[][] arr = new int[3][4];

		System.out.println(arr.length);
		System.out.println(arr[1].length);

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}
		int num = 6;
		String result = (num % 2 == 0) ? "Even" : "Odd";

		System.out.println(result); // Odd
	}

}
