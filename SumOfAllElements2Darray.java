package com.javalogicalstatements.Arrays;

public class SumOfAllElements2Darray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 5, 10 } };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				int k = arr[i][j];
				sum = sum + k;

			}

		}
		System.out.print(sum);

	}
}
