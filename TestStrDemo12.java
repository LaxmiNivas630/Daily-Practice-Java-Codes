package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = new String();
		String s3 = null;
		String s4 = " ";

		System.out.println(s1.isEmpty());// true -->Returns true if, and only if, length() is 0.
		System.out.println(s1.isBlank());// true -->Returns true if the string is empty or contains only white space
											// codepoints, otherwise false.

		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());

//		System.out.println(s3.isEmpty());
//		System.out.println(s3.isBlank());

		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
		
	}

}
