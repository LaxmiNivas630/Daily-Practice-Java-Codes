package com.oopsinheritance;

public class Device {
	String brand;
	int power;

	Device(String brand, int power) {
		this.brand = brand;
		this.power = power;

	}

	void showDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Power : " + power);

	}
}


