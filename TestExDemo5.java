package exceptionhandling;

import java.util.Scanner;

public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			System.out.println(a * 10);
		} catch (Exception e) {
			e.printStackTrace();

		}
		sc.close();
		System.out.println("main method started !!");
	}

}
