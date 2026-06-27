package com.stringhandling;

public class TestStrDemo3 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Srikanth";

		s1.concat(s2);
		System.out.println(s1);//Java

		String str1 = "Sachin";
		String str2 = "Tendulkar";
		str1 = str1.concat(str2);
		System.out.println(str1);//SachinTendulkar
		
	}

}
