package com.javastartpatterns;

public class Print10101 {

	public static void main(String[] args) {
		int r = 4;
		int c = 5;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");

				}
			}
			System.out.println();

		}

	}

}
