package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(7, "MSD");
		m.put(18, "virat");
		m.put(34, "pandya");
		m.put(35, "pandya");
		System.out.println(m);
		System.out.println("--------------------------");

		Set<Integer> set = new HashSet<>();
		set.add(18);
		set.add(34);
		set.add(37);
		set.add(27);
		set.add(45);
		set.add(52);
		set.add(77);
		set.add(99);

		System.out.println(set);

	}

}
