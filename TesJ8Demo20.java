package com.java8features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TesJ8Demo20 {

	public static void main(String[] args) {

		System.out.println("Main method started !!");

		Predicate<Integer> p1 = (i) -> i % 2 == 0;
		System.out.println(p1.test(9));

		BiPredicate<Integer, Integer> p2 = (i1, i2) -> (i1 * i2) % 2 == 0;
		System.out.println(p2.test(9, 8));

		BiPredicate<String, String> p3 = (s1, s2) -> s1.length() + s2.length() <= 15;
		System.out.println(p3.test("NivasBalu","M"));
		System.out.println(p3.test("Maradana", "M"));
		
	}

}
