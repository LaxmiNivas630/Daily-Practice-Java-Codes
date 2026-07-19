package com.multithreading;

class SThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run: " + i);
		}

	}

}

public class ThreadDemo7 {

	public static void main(String[] args) {
		System.out.println("Main method started ");

		SThread s = new SThread();
		s.start();
		s.interrupt();
		
		for (int i = 11; i <= 20; i++) {
			System.out.println("main: " + i);
		}
		
	}

}
