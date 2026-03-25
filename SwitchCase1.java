package com.javalogicalstatements;

import java.util.Scanner;

//WAP to calculate the values using switch cases
public class SwitchCase1 {

	public static void main(String[] args) {
		System.out.println("Main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();

		System.out.println("Enter a  symbol to proceed to calculate : ");
		String symb = sc.next();

		switch (symb) {

		case "+" ->
		{
			System.out.println("Addition");
		System.out.println(a + b);
		}
		case "-" ->
		{
			System.out.println("Substraction");
		System.out.println(a - b);
		
		}
		case "*" ->
		{
			System.out.println("Multiplication");
			System.out.println(a * b);
		}
		case "%" ->
		{
			System.out.println("Modulus to find reminder");
			System.out.println(a % b);
		
		}
		case "/" ->
		{
			System.out.println("Division to find Quotient  ");
			System.out.println(a / b);
		}
		default -> System.out.println("Invalid symbol  to proceed !! ");

		}

	}

}
