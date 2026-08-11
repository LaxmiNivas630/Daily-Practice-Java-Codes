package com.java8features;

interface In10 {
	public int squareit(int n);

}

public class TestJ8Demo10 {

	public static void main(String[] args) {

//		In10 i = (n) -> n * n;
//
//		System.out.println(i.squareit(10));

		In10 i = (n) -> {
			return n * n;
		};
		System.out.println(i.squareit(100));

	}

}
