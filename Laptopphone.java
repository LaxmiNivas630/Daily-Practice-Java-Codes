package com.oopsinheritance;

class LaptopDevice {
	String brand;
	String power;

	public LaptopDevice(String brand, String power) {
		super();
		this.brand = brand;
		this.power = power;
	}

	void showDetails() {
		System.out.println(brand);
		System.out.println(power);
	}
}

class macbook extends LaptopDevice {

	public macbook(String brand, String power) {
		super(brand, power);
	}

}

class smartphone extends LaptopDevice {

	public smartphone(String brand, String power) {
		super(brand, power);
	}

}

public class Laptopphone {

	public static void main(String[] args) {

		LaptopDevice mb = new macbook("HP PAVILION", "35000mphA");
		LaptopDevice sp = new smartphone("OPPO RENO 12 PRO", "5000mphA");
		System.out.println("Laptop brand : " + mb.brand);
		System.out.println("Laptop power : " + mb.power);
		System.out.println("-----------------------------------");
		System.out.println("smartphone brand : " + sp.brand);
		System.out.println("smartphone power : " + sp.power);

	}

}
