package com.javalogicalstatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		System.out.println("Welcome to Balaji Vegetable & Fruits market");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a category : ");
		String catg = sc.next();

		String yn = "";

		do {

			switch (catg) {

			case "veg" -> {
				System.out.println("Enter a Item for Vegtables : ");
				String item = sc.next();

				switch (item) {
				case "tmt" -> System.out.println("Tomoto & the price is 20rs per kg ");
				case "ppt" -> System.out.println("Potato & the price is 40rs per kg ");
				case "dmst" -> System.out.println("Drumstick & the price is 100 rs per kg");
				case "bn" -> System.out.println("Beans & the price is 60 rs per kg");
				case "cb" -> System.out.println("Cabbage & the price is 20 rs per kg");
				case "cf" -> System.out.println("Cauliflower & the price is 35 rs per kg");
				case "br" -> System.out.println("Brinjal & the price is 40 rs per kg");
				case "lk" -> System.out.println("Lady Finger & the price is 45 rs per kg");
				case "pt" -> System.out.println("Pumpkin & the price is 18 rs per kg");
				case "rd" -> System.out.println("Radish & the price is 22 rs per kg");
				case "sp" -> System.out.println("Spinach & the price is 15 rs per bunch");
				default -> System.out.println("Entered Item is not available :");
				}

			}

			case "Fru" -> {
				System.out.println("Enter a Item for fruits : ");
				String item = sc.next();

				switch (item) {
				case "mng" -> System.out.println("Mango & the price is 300 rs per kg");

				case "org" -> System.out.println("Orange & the price is 120 rs per kg");
				case "apl" -> System.out.println("Apple & the price is 180 rs per kg");
				case "bnn" -> System.out.println("Banana & the price is 60 rs per dozen");
				case "grf" -> System.out.println("Grapes & the price is 90 rs per kg");
				case "pnp" -> System.out.println("Pineapple & the price is 50 rs per piece");
				case "wmn" -> System.out.println("Watermelon & the price is 40 rs per kg");
				case "str" -> System.out.println("Strawberry & the price is 250 rs per kg");
				case "pap" -> System.out.println("Papaya & the price is 70 rs per kg");
				case "gva" -> System.out.println("Guava & the price is 80 rs per kg");

				default -> System.out.println("Entered Item is not available :");
				}

			}

			default -> System.out.println("Entered Category is invalid ");
			}

			System.out.println("Do you want to proceed  click y or n ..? : ");
			yn = sc.next();

		} while(yn.equalsIgnoreCase("y"));

	}

}
