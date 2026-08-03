package com.java8features;

@FunctionalInterface
interface In3 {
	void addition(int a, int b);

}

public class TestJ8Demo3 {

	public static void main(String[] args) {

		In3 i = (a, b) -> {
			int sum = a + b;
			System.out.println(" addition of two values :" + sum);

		};
		i.addition(100, 200);
	}

}
