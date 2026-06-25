package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {
		String s1 = "Java";// String Literals ---> SCP : String Constant pool
		String s2 = "Java";// 0 objects
		String s3 = "Java";// 0 objects

		String s4 = new String("Srikanth");// String object Literals --->Heap Area + SCP ----> 2 objects
		String s5 = new String("Srikanth");// String object Literals ---> SCP :Heap Area + SCP : -> 2 objects

		String s6 = "Java";// String Literals ---> SCP : 0 objects

		String s7 = new String(s6);// 1 0bject : Creating object with another String
		
		String s9 = s5;//re-assigning & creating String
		String s8 = s6+s3;//Concatenation Operator // SrikanthJava
		
	}

}
