package com.oopsabstraction;

interface Camera {
	void takephoto();

}

interface MusicPlayer {
	void MusicPlayer();

}

class SmartPhone1 implements Camera, MusicPlayer {

	@Override
	public void MusicPlayer() {
		System.out.println(" kavya listening music ");
	}

	@Override
	public void takephoto() {
		System.out.println("Kavya Photo captured successfully completed");

	}

}

public class Main {

	public static void main(String[] args) {
		Camera c = new SmartPhone1();
		c.takephoto();
		System.out.println();
		MusicPlayer mp = new SmartPhone1();
		mp.MusicPlayer();

	}

}
