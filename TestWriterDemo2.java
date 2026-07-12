package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriterDemo2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Main method Started !!!");

		FileWriter fw = new FileWriter("D:\\FileIo\\Nivas1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(65);
		bw.write(64);
		bw.write("Chill");
		bw.newLine();
		bw.write("Try to be Active");
		bw.newLine();

		bw.write("Focus on learning");
		bw.newLine();
		
		bw.flush();
		bw.close();
		fw.close();

		
	}

}
