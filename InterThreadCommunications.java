package com.multithreading;

class Resources {
	int i = 0;

	boolean status = false;

	synchronized void put(int i) throws InterruptedException {

		if (status) {
			wait();
		}

		this.i = i;
		System.out.println("PUT : " + i);
		status = true;
		notify();

	}

	synchronized void get() throws InterruptedException {

		if (!status) {
			wait();

		}
		System.out.println("GET : " + i);
		status = false;
		notify();
	}

}

class Producers implements Runnable {
	Resources r;

	public Producers(Resources r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();

	}

	@Override
	public void run() {
		int i = 1;
		while (true) {

			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

class Consumers implements Runnable {
	Resources r;

	public Consumers(Resources r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {

		while (true) {
			try {
				r.get();

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

public class InterThreadCommunications {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		Resources r = new Resources();

		Producers p = new Producers(r);

		Consumers c = new Consumers(r);

	}

}
