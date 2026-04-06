package com.javalogicalstatements.Arrays;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[10];// 0 to 9

		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;
		numbers[3] = 104;
		numbers[4] = 105;
		numbers[5] = 106;
		numbers[6] = 107;
		numbers[7] = 108;
		numbers[8] = 109;
		numbers[9] = 110;

		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);

			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

}
