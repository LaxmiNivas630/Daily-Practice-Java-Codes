package com.collections;

import java.util.ArrayList;

import java.util.Collection;

public class PrimeNumbers {
	static boolean isprime(int a) {
		if (a <= 1)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(17);
		list.add(20);

		System.out.println(list);
		System.out.println("Prime numbers ");
		boolean status = false;
		for (int i : list) {
			status = isprime(i);
			if (status) {
				System.out.println(i + " ");
				continue;
			}

		}

	}

}
