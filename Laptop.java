package com.oopsinheritance;

public class Laptop extends Device {
	Laptop(String brand, int power) {
		super(brand, power);
	}

	void openLid() {
		System.out.println("Laptop Lid opened");
	}

}

