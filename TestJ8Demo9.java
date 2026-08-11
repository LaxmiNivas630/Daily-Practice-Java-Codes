package com.java8features;

@FunctionalInterface
interface In9 {
	
	public void m2(int a, int b);

}

public class TestJ8Demo9 {

	public static void main(String[] args) {
		In9 t = (a, b) -> System.out.println("hello" + (a+b));
		t.m2(10,20);

	}

}
