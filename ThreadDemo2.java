package com.multithreading;

class VideoThread extends Thread {

	@Override
	public void run() {
		System.out.println("Video started ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Video Thread : ");

		}
		System.out.println("Video ended !!!");
	}

}

class AudioThread extends Thread {

	@Override
	public void run() {
		System.out.println("Audio started ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio Thread : ");

		}
		System.out.println("Audio ended !!!");
	}
}

class TimerThread extends Thread {

	@Override
	public void run() {
		System.out.println("Timer started ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer Thread : ");

		}
		System.out.println("Timer ended !!!");

	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		VideoThread v1 = new VideoThread();
		v1.start();

		AudioThread a1 = new AudioThread();
		a1.start();

		TimerThread t1 = new TimerThread();
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main : ");

		}

		System.out.println("Main method ended!!!");
	}

}
