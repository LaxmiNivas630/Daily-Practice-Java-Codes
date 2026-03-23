package com.javalogicalstatements;

import java.util.Scanner;

//WAP to provide description about T_shirts ..?
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter T -Shirt size to provide details ");
		Scanner sc = new Scanner(System.in);

		int t_shirtSize = sc.nextInt();

		switch (t_shirtSize) {

		case 36 -> System.out.println("Small-size T shirt");

		case 38 -> System.out.println("Medium-size T shirt");

		case 40 -> System.out.println("Large-size T shirt");

		case 42 -> System.out.println("Xtra Large-size T-shirt");

		default -> System.out.println("Entered size is not available");

		}
	}

}
