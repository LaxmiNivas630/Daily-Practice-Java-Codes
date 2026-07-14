package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo6 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NivasBaluu\\Downloads");
		
		
		File[] files = f.listFiles();
		int dirCount = 0;
		int fileCount = 0;
		int misCount = 0;

		for (File file : files) {

			if (file.isDirectory()) {
				dirCount++;

			} else if (file.isFile()) {
				fileCount++;

			} else {
				misCount++;
			}
		}
		System.out.println("Directory Count : " + dirCount);
		System.out.println("File Count : " + fileCount);
		System.out.println("Additionals : " + misCount);
	}
}
