package com.java8features;

interface In11 {
	void hello(String s);

}

public class TestJ8Demo11 {

	public static void main(String[] args) {

		In11 i = (s) -> System.out.println(s.length());
		i.hello("Java is simple");

	}

}
