package com.javalogicalstatements.Arrays;

import java.util.Scanner;

public class ArrayRotationRightToLeft {
	public static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void arrayRotation(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;

//		Reverse total array
		arrayReverse(arr, start, end);

//		Reverse first half array
		arrayReverse(arr, start, r - 1);

//		reverse second half array
		arrayReverse(arr, r, end);

	}

	public static void main(String[] args) {
		System.out.println("Main method Stated !");

		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Enter how many times you want to Rotate..?");
		int r = sc.nextInt();

		System.out.println("Before Rotation : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		arrayRotation(arr, r);

		System.out.println();
		System.out.println("After Rotation : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();

	}

}
