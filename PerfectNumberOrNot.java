package com.javalogicalstatements1.loops;

import java.util.Scanner;

//WAP to check the given number is perfect or not...?
public class PerfectNumberOrNot {

	static boolean isPerfect(int n) {
		boolean flag =false;
		int sum =0;
		
		for(int i = 1;i<=n/2;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		
		if (sum == n) {
			flag = true;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();

		boolean status = isPerfect(num);

		if (status) {
			System.out.println("The Given number is perfect !!");
			}else {
				System.out.println("The Given number is not a perfect !!");
			}
	}

}
