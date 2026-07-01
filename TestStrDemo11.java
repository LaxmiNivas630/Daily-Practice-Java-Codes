package com.stringhandling;

public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		String s1 = "Java";// It is storing in scp
		String s2 = new String("Java");// it is Storing heap

		s2 = s2.intern();//Coverting heap to scp is the concept of intern
		System.out.println(s1 == s2);//false

		String str = "Java is simple in Vcube in jntu";

		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));

		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));

		System.out.println(str.indexOf("in", str.indexOf("in") + 1));
	}

}
