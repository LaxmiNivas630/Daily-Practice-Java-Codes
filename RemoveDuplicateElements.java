package com.javalogicalstatements.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		System.out.println("Main Method Started !");

		int[] arr = { 1, 2, 3, 3, 2, 1, 4 };

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(arr[i] + " ");
			}

		}
	}

}
