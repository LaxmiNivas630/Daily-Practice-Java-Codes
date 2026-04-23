package com.javastartpatterns;

public class PatternPrintNameDigonal {

	public static void main(String[] args) {
		char a[] = { '&', '&', '&', '&', '&','&','&','&','&','&' ,'&'};
		char a1 = 'a';
		
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {
				if (i == j || i + j == a.length - 1) {
					System.out.print(a[i] + " ");
				} else {
					System.out.print(a1++ + " ");
					if(a1=='Z'+1) {
						a1='a';
					}
					else if(a1=='z'+1) {
						a1='A';
					}
				}

			}
			System.out.println();

		}

	}

}
