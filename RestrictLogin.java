package com.javalogicalstatements1.loops1;

import java.util.Scanner;

public class RestrictLogin {

	public static void main(String[] args) {
		System.out.println("Main method started ! ");

		String username = "Admin";
		String password = "Admin@123";
		int attempts = 0;

		Scanner sc = new Scanner(System.in);

		while (attempts < 3) {
			System.out.println("Enter  your user name :");
			String user = sc.next();

			System.out.println("Enter a password :");
			String pass = sc.next();

			if (user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Login Successful ");
				break;

			} else {
				System.err.println("Invalid  User Credentials !");
				attempts++;
			}

		}

		if (attempts == 3) {
			System.err.println("Your account is Locked for 24 hours ");
		}

	}

}
