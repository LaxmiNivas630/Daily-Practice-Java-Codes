package com.javalogicalstatements;

public class Divisible2 {

	public static void main(String[] args) {

		int num = 25;

		if (num % 5 == 0) {
			System.out.println("divisible");
		} else {
			System.out.println("not divisible");
		}

		// 7. Largest of 3 numbers
		int a1 = 5, b1 = 7, c1 = 3;
		if (a1 > b1 && a1 > c1) System.out.println(a1);
		else if (b1 > c1) System.out.println(b1);
		else System.out.println(c1);
		
		// 8. Check leap year
		int year = 2028;
		if (year % 4 == 0) System.out.println("Leap Year");
		else System.out.println("Not Leap Year");

		// 9. Character is vowel or consonant
		char ch = 'a';
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    System.out.println("Vowel");
		else System.out.println("Consonant");

		// 10. Check number is 3-digit
		int num2 = 123;
		if (num2 >= 100 && num2 <= 999)
		    System.out.println("3 Digit");
		else System.out.println("Not 3 Digit");
		
		// 11. Temperature check
		int temp = 30;
		if (temp > 25) System.out.println("Hot");
		else System.out.println("Cold");
		
		// 12. Pass or fail
		int marks = 40;
		if (marks >= 35) System.out.println("Pass");
		else System.out.println("Fail");

		// 13. Positive, negative, zero
		int num3 = 0;
		if (num3 > 0) System.out.println("Positive");
		else if (num3 < 0) System.out.println("Negative");
		else System.out.println("Zero");

		// 14. Check alphabet
		char c = 'A';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		    System.out.println("Alphabet");
		else System.out.println("Not Alphabet");


		
	}
	

}
