package com.fileio;

import java.io.File;

public class TestDemo5 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\NivasBaluu\\Downloads");

		String[] names = f.list();
		int count = 0;

		for (String name : names) {
			System.out.println(name);
			count++;

		}
		System.out.println("Count of the files : " + count);
	}

}
