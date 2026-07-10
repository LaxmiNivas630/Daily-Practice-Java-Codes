package com.fileio;

import java.io.File;

public class TestFileDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Main method started !!");

		File f = new File("D:\\FileIo\\Sri");
		
		boolean status =f.mkdir();
		
		if(status) {
			System.out.println("Directory has been created successfully");
			
		}else {
			System.out.println("something went wrong !");
			
		}
	}

}
