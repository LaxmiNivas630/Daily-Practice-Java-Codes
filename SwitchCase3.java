package com.javalogicalstatements;

import java.util.Scanner;

//
public class SwitchCase3 {

	static String getDayInfo(String day) {

		switch (day) {
		case "Monday":
			return "Lazy day";
		case "Tuesday", "Wednesday", "Thursday":
			return "Lazy day";
		case "friday":
			return "Weekend mode started";
		case "Saturday", "Sunday":
			return "Weekend with Holiday";

		default:
			return "entered day is invalid";
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day");
		String day = sc.next();
		System.out.println(getDayInfo(day));
		sc.close();
	}

}
