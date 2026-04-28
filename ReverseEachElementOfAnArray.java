package com.javalogicalstatements.Arrays;

public class ReverseEachElementOfAnArray {

	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 15, 78 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int rem = 0;

			while (n > 0) {
				int digit = n % 10;
				rem = rem * 10 + digit;
				n = n / 10;
			}
			arr[i] = rem;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
