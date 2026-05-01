package com.oopsinheritance;

public class SmartPhone extends Device {
	SmartPhone(String brand, int power) {
		super(brand, power);
	}

	void makeCall() {
		System.out.println("Calling");
	}

	

}
