package com.stringhandling;

//A-Z : 65-90
//a-z : 97-122

public class TestStrDemo6 {

	public static void main(String[] args) {
		
		String s1 = "Abhi";
		String s2 = "Abhi";
		
		//compares two strings lexicographically

		System.out.println(s1.compareTo(s2));

		String s3 = "Srikanth";//107
		String s4 = "Srinivas";//110

		System.out.println(s3.compareTo(s4));
		
		String s5 = "Java";//107
		String s6= "Java";//110

		System.out.println(s5.compareTo(s6));
		
		String s9 = " Java Srikanth";//107
		String s10 = "Java";//110

		System.out.println(s9.compareTo(s10));
        System.out.println(s9.concat(s10));
        System.out.println("Srikanth" + "Java" +10 + 5.9);
        
        String s11 = "Spring";
        System.out.println(s11.contentEquals("Spring"));
        
        String s12 ="Spring";
        System.out.println(s11.equals(s12));
        System.out.println(s11.equalsIgnoreCase("Spring"));
        
        System.out.println(s11.contentEquals(s12));
	}

}
