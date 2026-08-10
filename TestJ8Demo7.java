package com.java8features;



public class TestJ8Demo7 {
	public static void main(String[] args) {
		System.out.println("Main method started !");

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};

		Thread th = new Thread(r);
		th.start();
		
		Runnable r1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};

		Thread th1 = new Thread(r1);
		th1.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}

		System.out.println("main method ended!!");
	}

}
