package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = "null";
			System.out.println("length of string"+s.length());

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			System.out.println("Enter your total marks : ");
			int marks = sc.nextInt();

			System.out.println("Enter no. of subjects : ");
			int sub = sc.nextInt();

			int avg = marks / sub;
			System.out.println("Avg : " + avg);

			String name = null;
			System.out.println(name.length());

		} catch (NullPointerException e) {
			System.err.println("NullPointerException occurs");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("ArthmeticException");
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
