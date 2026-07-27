package com.java8features;

//Note: If we have abstract methods in interface then,
//Invalid '@FunctionalInterface' annotation;
//In1 is not a functional interface

//Note: Lambda Expression works with only functional interfaces but not in all the faces  
//so  If you want to work with lambda expression we must need to have functional interface.
//Lambda Expressions introduced to achieve concise coding 


//@FunctionalInterface: FI means, which contains only one abstract method 

@FunctionalInterface
interface In1 {
	void method1();

}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("Main method started ");

		In1 i = () -> {
			System.out.println("Method 1 called ");

		};
		
		i.method1();

		System.out.println("Main method ended!!! ");

	}

}
