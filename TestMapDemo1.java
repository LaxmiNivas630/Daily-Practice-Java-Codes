package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(45, "Rohit");
		m.put(33, "Pandya");
		m.put(34, "Pandya");
		m.put(1, "Rahul");
		m.put(45, "Rohit");
		m.put(null, "Srikanth");
		m.put(2, null);
		m.put(3, null);
		System.out.println(m);


	}

}
