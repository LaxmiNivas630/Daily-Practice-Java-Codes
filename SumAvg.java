package com.javalogicalstatements.Arrays;

public class SumAvg {

	public static void main(String[] args) {
		System.out.println("Main method started !");

		int[] marks = { 95, 73, 75, 61, 48, 52 };

		double sum = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];

		}
		System.out.println("Sum of the Marks : " + sum);

		avg = sum / marks.length;

		System.out.println("Avgerage  of the given Marks : " + avg);
	}

}
