package com.java8featurestreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo3 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		// Salaries
		List<Double> salaries = Arrays.asList(80000.00, 40000.00, 30000.00, 70000.00, 60000.00);

		List<Double> upSalaries = salaries.stream().map(d -> d + 5000.00).filter(i -> i > 50000.00).sorted()
				.collect(Collectors.toList());

		System.out.println("Updated Salaries:");
		System.out.println(upSalaries);

		System.out.println("--------------------------------");

		// Names
		List<String> names = Arrays.asList("Manohar", "Amar", "Vinod", "Anil", "Varshit", "Srikanth", "Rakesh");

		List<String> upNames = names.stream().map(name -> name + "-JFS71-Vcube").collect(Collectors.toList());

		System.out.println("Updated Names:");

		// Using Lambda Expression
		upNames.forEach(name -> System.out.println(name));

		System.out.println("--------------------------------");

		// Using Method Reference
		upNames.forEach(System.out::println);

	}

}
