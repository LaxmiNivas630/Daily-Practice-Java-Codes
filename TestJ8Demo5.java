package com.java8features;

//Lambda expressions Vs  multithreading 

public class TestJ8Demo5 {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run " + i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main " + i);
		}
	}

}
