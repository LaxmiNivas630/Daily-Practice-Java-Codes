package com.stringhandling;

public class TestStrDemo19 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());// 0
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.length());// 8
		System.out.println(sb2.capacity());// 24
		System.out.println("**************************");

		StringBuffer sb3 = new StringBuffer();
		sb3.append("Srikanth");
		System.out.println(sb3.capacity());// 16
		System.out.println("**************************");

		StringBuffer sb4 = new StringBuffer();
		sb4.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		System.out.println(sb4.capacity());// 34 CurrentCapacity * 2 + 2 = 34

		System.out.println("**************************");

		StringBuffer sb5 = new StringBuffer();
		sb5.append("SrikanthSrikanth");
		sb5.append("SrikanthSrikanth");
		sb5.append("SrikanthSrikanthSrikanthSrikanth");
		sb5.append("Srikanth");

		System.out.println(sb5.capacity());// 16

	}

}
