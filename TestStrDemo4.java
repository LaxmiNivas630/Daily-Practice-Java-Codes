package com.stringhandling;

//String Concatenation
//concat method will expect only String we can only String Concatenation
//but with + Operator we can Concatenate any other data type.

public class TestStrDemo4 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
	    String s2 = "Java";
	    String s3 = s1.concat(s2);//HelloJava
	    System.out.println(s3);
	    
	    String ss1 = "Rahul";
	    String ss2 = "David";
	    int i =1234;
	 
	    String ss3 = ss1+ss2 + i;
	    System.out.println(ss3);
	    
	    int i1 = 10;
	    int i2 = 20;
	    String s6 = "Java";
	    
	    System.out.println(s6 + i1 + i2);
	    
	    System.out.println(i1 + i2 + s6 + "Srikanth" + 40 + 50);;
	     
	    
	    
		
	}

}
