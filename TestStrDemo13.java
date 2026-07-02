package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {
		
		String str = String.join("-","Java","is","simple","in","Vcube" );
		
		System.out.println(str);
		
		String str1="Good-Morning-kodanda-Sriram-hava-a-nice-day";
		
		String[] words =str1.split("-",4);
		int count =0;
		
		
		for(String word :words) {
			count++;
			System.out.println(word);
			
		}
		System.out.println("count of all the words : " + count);
		System.out.println(str.length());
	}  

}
