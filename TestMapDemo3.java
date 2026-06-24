package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to find occurrences of each character...?
//input is : Java
//output : J=1 a=2 v=1
public class TestMapDemo3 {

	public static void main(String[] args) {
		System.out.println("'Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		Map<Character, Integer> map = new HashMap<>();
		System.out.println(map);

		char[] ch = str.toCharArray();// J A V A

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entries = map.entrySet();

		for (Entry<Character, Integer> entry : entries) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		sc.close();

	}
}