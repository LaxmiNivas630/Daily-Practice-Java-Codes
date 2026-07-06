package com.stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Srikanth");
		System.out.println(sb);
		
//Type mismatch: cannot convert from String to StringBuffer
		//StringBuffer sb1 = "Srikanth Java";// String Literals only for String but not for any class
		//System.out.println(sb1);
		
		String s1 = "Java"; 
		s1.concat("Srikanth");
		System.out.println(s1);
		
//StringBuffer & StringBuilder both are mutable 
//if our requirement is synchronization related functionalities then go for StringBuffer
//if we want work multiple threads parallel then will use StringBuilder for better performance 	
		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.append("Java");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Srikanth");
		sb2.append("Java");
		System.out.println(sb2);
	}

}
