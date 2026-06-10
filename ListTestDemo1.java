package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTestDemo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size());//0
		list.add(0,20);

		list.add(1,20);
//		list.add(10);
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(null);
//		list.add(null);
	
		System.out.println(list);
	}

}
