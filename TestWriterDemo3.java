package com.fileio;

import java.io.PrintWriter;
import java.io.IOException;

public class TestWriterDemo3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started !!!");
		PrintWriter pw = new PrintWriter("D:\\FileIo\\Nivas1.txt");

		pw.println("Hello");
		pw.println(100);
		pw.println(55.5);
		pw.println(5.5);
		pw.println('c');
		pw.println(pw);

		pw.flush();
		pw.close();

	}

}
