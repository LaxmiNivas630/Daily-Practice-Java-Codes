package com.java8featurestreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(10, 7, 45, 18, 1, 4, 8);

		List<Integer> l2 = l1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

		System.out.println("Original List: " + l1);
		System.out.println("Even Numbers : " + l2);
		
		System.out.println("..............................");

		List<String> l3 = Arrays.asList("Sachin", "Dhoni", "Rohit", "Kohli", "Rahul", "Abhishek", "Jack");

		List<String> l4 = l3.stream().filter(s -> !s.contains("oh")).collect(Collectors.toList());

		System.out.println("Original List : " + l3);
		System.out.println("Filtered List : " + l4);

	}

}
