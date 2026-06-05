package com.collections;

import java.util.ArrayList;

public class EvenOddCount {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int evenCount = 0;
		int oddCount = 0;

		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		for (Integer i : list) {
			if (i % 2 == 0)
				evenCount++;

			else
				oddCount++;

		}
		System.out.println("Even Number Count :" + evenCount);
		System.out.println("Odd Number Count :" + oddCount);

	}

}
