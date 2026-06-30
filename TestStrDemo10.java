package com.stringhandling;

public class TestStrDemo10 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		String str = "Java is simmple ";
		
		char[] ch = new char[10];
		
		str.getChars(0, 4, ch, 0);
		
		for(char c:ch) {
			System.out.print(c + " ");
		}
		
		
	}

}
