package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxElements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(25);
		list.add(10);
		list.add(45);
		list.add(5);
		list.add(30);

		System.out.println("Minimum Number : " + Collections.min(list));
		System.out.println("Maximum Number : " + Collections.max(list));

	}

}
