package com.javastartpatterns;

public class PrintNameDiagonal {

	public static void main(String[] args) {
		char a[] = { 'N', 'I', 'V', 'A', 'S'};
		char a1 = 'A';

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {
				if (i == j || i + j == a.length - 1) {
					System.out.print(a[i] + " ");
				} else {
					System.out.print(a1++ + " ");
				}

			}
			System.out.println();
		}

	}
}
