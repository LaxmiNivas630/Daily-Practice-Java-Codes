package com.java8features;

@FunctionalInterface
interface In8 {
	public void m1();

}

public class TestJ8Demo8 {

	public static void main(String[] args) {
		In8 t = () -> System.out.println("hello");
		t.m1();

	}

}
