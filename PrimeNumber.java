package com.javalogicalstatements1.loops;

//WAP to print prime Numbers up to 100 Numbers ...?
public class PrimeNumber {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;

		}

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				status = false;
				break;

			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started !!");

		for (int i = 0; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Main method ended !!");

	}

}
