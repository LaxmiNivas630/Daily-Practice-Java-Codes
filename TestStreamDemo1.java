package com.java8featurestreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started !!!");

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(7);
		list.add(18);
		list.add(45);
		list.add(1);
		list.add(30);
		list.add(4);
		list.add(8);

		System.out.println("Original List: " + list);

		Stream<Integer> s = list.stream();
		Stream<Integer> s1 = s.filter(i -> i % 2 == 0);
		List<Integer> list2 = s1.collect(Collectors.toList());
		System.out.println("Even Numbers: " + list2);
	}
}
