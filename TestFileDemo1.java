package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started !!");
		
		File f = new File("D:\\FileIo\\Nivas1.txt");
		
//Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.		
		boolean status = f.createNewFile();
		
		if(status) {
			System.out.println("File has been created successfully!!");
			
		}else {
			System.out.println("File has been not created successfully!!");

			
		}
		
		System.out.println("Main method ended!!!");
		
	}

}
 