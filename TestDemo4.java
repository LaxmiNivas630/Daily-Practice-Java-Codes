package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo4 {

	public static void main(String[] args) throws IOException {

		System.out.println("Main method started !!");

		File f = new File("D:\\FileIo\\Sri");

		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.getAbsolutePath());// String
		System.out.println(f.getAbsoluteFile());// File
		System.out.println(f.getCanonicalPath());// String
		System.out.println(f.getCanonicalFile());// File

		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());

//		boolean status = f.mkdir();
//
//		if (status) {
//			System.out.println("Directory has been created successfully");
//
//		} else {
//			System.out.println("something went wrong !");
//
//		}
	}

}
