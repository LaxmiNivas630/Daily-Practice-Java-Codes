package com.java8features;

interface In13 {
	void hello();

	void show();
}

class Test1 {
	void method1() {
		System.out.println("method1 called from Test1");

	}
}

public class TestJ8Demo13 {

	public static void main(String[] args) {

		System.out.println("Main method started !!");

// Anonymous Inner class extends Test1
		Test1 t1 = new Test1() {
			void method1() {
				System.out.println("method1 called from Anonymos");

			}

		};
		t1.method1();

// Anonymous Inner class Implements In1
		In13 i = new In13() {
			@Override
			public void hello() {
				System.out.println("Hello Good Afternoon");

			}

			@Override
			public void show() {
				System.out.println("Hello show !!");
			}
		};
		i.hello();
		i.show();

	}

}
