package com.stringhandling;

import java.util.Scanner;

//wap to find vowels and consonants from given string.
public class TestStrDemo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine().toLowerCase();
		char[] ch = str.toCharArray();

		int vowCount = 0;
		int consCount = 0;
		int digitCount = 0;

		for (char c : ch) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowCount++;

				} else {
					consCount++;
				}
			} else if (Character.isDigit(c)) {
				digitCount++;

			}
		}
		System.out.println("vowels Count : " + vowCount);
		System.out.println("consonants Count : " + consCount);
		System.out.println("digit Count : " + digitCount);
	}

}
