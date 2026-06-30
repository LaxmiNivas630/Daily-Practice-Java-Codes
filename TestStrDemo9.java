package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println("getBytes()!!!!!!!!!!!!!!!!!!!!!");
		byte[] bytes = str.getBytes();

//		for(int i=0;i<bytes.length;i++) {
//			System.out.println((char)bytes[i]);
//		}
//		
		for (int i = bytes.length - 1; i >= 0; i--) {
			System.out.print((char) bytes[i]);
		}
	}

}
