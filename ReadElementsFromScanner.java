package com.javalogicalstatements.Arrays;

import java.util.Scanner;

public class ReadElementsFromScanner {

	public static void main(String[] args) {
		System.out.println("Main method ended !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		for (int a : arr) {
			System.out.print(a + " ");

		}

	}

}
