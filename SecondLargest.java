package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class SecondLargest {

	public static void main(String[] args) {
		Collection<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(25);
		num.add(40);
		num.add(15);
		num.add(35);
		num.add(20);

		int large = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int n : num) {
			if (n > large) {
				secondlargest = large;
				large = n;

			} else if (n > secondlargest && n != large) {
				secondlargest = n;

			}

		}
		System.out.println(secondlargest);
		System.out.println(large);

	}

}
