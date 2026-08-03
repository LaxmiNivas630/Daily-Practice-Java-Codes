package com.java8features;

public class TestJ8Demo6 {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Runnable t = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};

		Thread th = new Thread(t);
		th.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}

		System.out.println("main method ended!!");
	}

}
