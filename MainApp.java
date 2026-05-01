package com.oopsinheritance;

public class MainApp {
	public static void main(String[] args) {
		Laptop l = new Laptop("Hp", 65);
		l.showDetails();
		l.openLid();
		
		System.out.println("*****************************");

		SmartPhone sp = new SmartPhone("Smasung", 20);
		sp.showDetails();
		sp.makeCall();
	}
}

