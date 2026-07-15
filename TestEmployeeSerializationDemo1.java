package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	
	private static final long serialVersionUID = -2088250950861319381L;
	String username = "Srikanth";
	transient String  password = "Javaissimple";
	int age = 22;
	long phone = 9999999999L;

}

public class TestEmployeeSerializationDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started !");

		//Serialization
		Employee emp1 = new Employee();

		FileOutputStream fos = new FileOutputStream("D:\\FileIo\\sri\\java123.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();
		fos.close();

	}

}
