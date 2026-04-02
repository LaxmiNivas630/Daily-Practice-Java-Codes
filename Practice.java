package com.javalogicalstatements1.loops;

public class Practice {

	public static void main(String[] args) {
	System.out.println("Main method started !");
	
	for(int i =1;i<=50;i++) {
		
		if(i%3==0) {
			System.out.println("Fizz");
		}else if(i%5==0) {
			System.out.println("Buzz");
			
		}
		
		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz");
		}else {
			System.out.println(i);
		}
		
			
	}
	
	

	}

}
