package com.stringhandling;

public class TestStrDemo20 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1.capacity());
		sb1.append("SrikanthSrikanthSrikanth");
		sb1.append("SrikanthSrikanth");
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer();
		sb2.append("Java");
		sb2.append("Srikanth");
		sb2.append("Srikanth");
		System.out.println(sb2.capacity());

		StringBuffer sb3 = new StringBuffer("Java is simple");

		sb3.delete(8, 14);
		System.out.println(sb3);
		sb3.deleteCharAt(5);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(100);
		System.out.println(sb4.capacity());
	}

}
