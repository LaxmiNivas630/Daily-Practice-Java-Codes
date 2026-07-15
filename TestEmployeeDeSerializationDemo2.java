package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//java.io.InvalidClassException
public class TestEmployeeDeSerializationDemo2 {

	//De-Serialization
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\FileIo\\sri\\java123.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee obj = (Employee) ois.readObject();

		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.phone);
		System.out.println(obj.age);

		ois.close();
		fis.close();
	}

}
