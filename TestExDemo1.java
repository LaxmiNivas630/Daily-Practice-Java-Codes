package exceptionhandling;

import java.util.Scanner;

public class TestExDemo1{

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		
		System.out.println("Enter a number :");
		int b = sc.nextInt();
		
		System.out.println(a/b);
		System.out.println("Main method ended !! ");
		
		
		

	}

}
