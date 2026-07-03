package com.stringhandling;

public class TestStrDemo15 {

	public static void main(String[] args) {
		// all leading and trailing space removed,
		String str = "        Java        is simple    ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);

		str = str.replaceAll("\\s", "");
		System.out.println(str);

// beginIndex the beginning index inclusive
//endIndex the ending index exclusive
		String str1 = "Hyderbad";
		System.out.println(str1.substring(0, 3));
		System.out.println(str1.subSequence(0, 3));

		int i = 100;
		char c = 'A';
		double sal = 500000.00;
		String str2 = "Srikanth";

//		Any data type to convert into String will use value of method 
		String i1 = String.valueOf(i);
		String sal1 = String.valueOf(sal);

		System.out.println(100 + i);
		System.out.println(100 + i1);
		System.out.println(1000000.00 + sal1);

		String i2 = "100";
		System.out.println(100 + i2);

//		String to int Coversertion
		int i3 = Integer.parseInt(i2);
		System.out.println(100 + i3);

//		String to long conversertion

		String ph = "9000258610";
		long ph1 = Long.parseLong(ph);
		System.out.println(ph1);

	}
}