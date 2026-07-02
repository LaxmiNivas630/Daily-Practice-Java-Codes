package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = "Java is simple in Vcube ";
		str = str.replace('i', 'e');
		System.out.println(str);

		str = str.replace("Java", "spring boot");
		System.out.println(str);
		System.out.println("******************************");

		String str1 = "Java 500090 hyderbad 1234";
		str1 = str1.replaceAll("\\d", "X");
		System.out.println(str1);

		String str2 = "AMBCD1242A";
		str2 = str2.replaceAll("\\D", "A");
		System.out.println(str2);

		System.out.println("Enter a phone number ");
		String phone = sc.nextLine();

		boolean phoneStatus = phone.matches("^[6-9]{1}[0-9]{9}$");
		System.out.println(phoneStatus);

		System.out.println("Enter a PAN");
		String pan = sc.nextLine();

		boolean panStatus = pan.matches("^[A-Z] {5}[0-9]{4}[A-Z]{1}$");
		System.out.println(panStatus);
	}

}
