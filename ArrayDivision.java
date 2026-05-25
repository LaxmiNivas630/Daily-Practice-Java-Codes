package com.javalogicalstatements.Arrays;

import java.util.Scanner;

public class ArrayDivision {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Array size :");
			int n = sc.nextInt();
			int a[] = {1,2,3,4,5};
//			System.out.println("Enter the no. of elements :");
//			for (int i = 0; i < n; i++) {
//				a[i] = sc.nextInt();
//			}
		

			System.out.println("enter dividing index");
			int k=sc.nextInt();
			int s=a[k]/k;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundException");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
	}

}
