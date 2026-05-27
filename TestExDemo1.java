package exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		int a = sc.nextInt();

		System.out.println("Enter b number :");
		int b = sc.nextInt();
		try {
			System.out.println(a / b);

		} catch (ArithmeticException ex) {
			System.err.println("Catch");
			System.err.println("WE should not enter zero's");
			ex.printStackTrace();
		}
		System.out.println("Main method ended !! ");

	}

}
