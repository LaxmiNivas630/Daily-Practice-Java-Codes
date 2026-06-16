package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {
//		SortedSet s = new TreeSet<>();
//		s.add("Srikant");
//		s.add("Java");
//		s.add(10);
//		s.add(10);
//		System.out.println(s);

		SortedSet<Integer> ss = new TreeSet<>();

		ss.add(10);
		ss.add(45);
		ss.add(18);
		ss.add(7);
		ss.add(0);
		ss.add(1);
		ss.add(9);
		ss.add(15);
		ss.add(10);
		ss.add(10);

		System.out.println(ss);// 0 1 7 10 15 18 45

		System.out.println(ss.first());// 0
		System.out.println(ss.last());// 45

		// Returns a view of the portion of this set whose elements are strictly less
		// than toElement.
		System.out.println(ss.headSet(18));// 0 1 7 9 10

		// Returns a view of the portion of this set whose elements are greater than or
		// equal to fromElement.
		System.out.println(ss.tailSet(18));// 10 15 18 45
		System.out.println(ss.subSet(7, 18));// 7 9 10 15

	}

}
