package com.java8features;

interface In15 {
	int add(int a, int b);
}

interface In14 {
	void hello();

	void show();
}

class Test2 {
	void method1() {
		System.out.println("method1 called from Test1");

	}
}

public class TestJ8Demo14 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		In15 i = (a, b) -> a * b;

		// Anonymous Inner class extends Test1
		Test2 t1 = new Test2() {
			void method1() {
				System.out.println("method1 called from Anonymos");

			}

		};
		t1.method1();

		// Anonymous Inner class Implements In1
		In14 i1 = new In14() {
			@Override
			public void hello() {
				System.out.println("Hello Good Afternoon");

			}

			@Override
			public void show() {
				System.out.println("Hello show !!");
			}
		};
		i1.hello();
		i1.show();

	}

}
