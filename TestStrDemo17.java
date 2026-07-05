package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

////wap to print Wheather the given two String Anagram or not..?
/// //Silent --> Listen 
/// eat -->ate
///race -->care
/// heart --> earth

public class TestStrDemo17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first String ");
		String s1 = sc.next();

		System.out.println("Enter a another String ");
		String s2 = sc.next();

		if (s1.length() != s2.length()) {
			System.out.println("The given String are not anagram ");
			return;

		}
		char[] ch1 = s1.toCharArray();// {'r','a','c','e'}
		char[] ch2 = s2.toCharArray();// {'c','a','r',e}

		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The given Strings are anagram");
			
			
		}else {
			System.out.println("The given Strings are not a anagram");
		}
		
	}

}
