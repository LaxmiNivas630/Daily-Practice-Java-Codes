package com.javalogicalstatements.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		int[] arr = { 40, 30, 20, 15, 5, 2 };
		int temp = 0;

		System.out.println("Sorted Array : Before Sort ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println("Sorted Array : After Sort ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
