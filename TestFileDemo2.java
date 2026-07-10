package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started !!");

		File f = new File("D:\\\\FileIo\\\\Nivas1.txt");
		// f.delete();

		boolean isExist = f.exists();
		if (!isExist) {
			f.createNewFile();
			System.out.println("The file has been created successfully");

		} else {
			System.out.println("The file is already available");
		}
		System.out.println("Main method ended!!!");
	}
 
}
