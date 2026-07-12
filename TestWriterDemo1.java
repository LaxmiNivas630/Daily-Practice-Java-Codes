package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriterDemo1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Main method Started !!!");

		FileWriter fw = new FileWriter("D:\\FileIo\\Nivas1.txt");

		fw.write(65);
		fw.write('\n');
		fw.write("Have a nice day");
		fw.write('\n');

		fw.write("Files concepts are crazy !");
		fw.write('\n');

		fw.flush();

	}

}
