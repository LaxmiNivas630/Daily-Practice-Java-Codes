package com.oopsabstraction;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product e = new Electronics();

		System.out.println("Enter no. products in Electronics ");
		int a = sc.nextInt();

		System.out.println("Total cost : " + e.buy(a));
		System.out.println();

		Product c = new Clothing();

		System.out.println("Enter no. products in Clothing ");
		int b = sc.nextInt();

		System.out.println("Total cost : " + c.buy(b));
		System.out.println();

		Product g = new Grocery();

		System.out.println("Enter no. products in Grocery ");
		int d = sc.nextInt();

		System.out.println("Total cost : " + g.buy(d));
		System.out.println();

	}

}
