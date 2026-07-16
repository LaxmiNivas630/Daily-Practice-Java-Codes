package com.multithreading;

public class ThreadDemo1 extends Thread {

	public static void main(String[] args) {
		System.out.println("Main method started !");
		System.out.println(Thread.currentThread());

		ThreadDemo1 t = new ThreadDemo1();
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}
		System.out.println("main method ended");

	}

	@Override
	public void run() {
		System.out.println("show method started !!");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Show : " + i);
		}

		System.out.println("Show method ended!!");

	}

}
