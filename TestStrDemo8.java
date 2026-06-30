package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username : ");

		String username = sc.next();

		System.out.println("Enter your password :");
		String password = sc.next();

		if (username.equalsIgnoreCase("admin") && password.equals("Admin@123")) {
			System.out.println("Welcome to Home Page !!");

		}else {
			System.err.println("Something went wrong or Invalid Credentials");
		}
		sc.close();

	}
	

}
