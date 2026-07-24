package com.multithreading;

public class LibraryBook implements Runnable {

	String bookTitle;
	int daysBorrowed;

	LibraryBook(String bookTitle, int daysBorrowed) {
		this.bookTitle = bookTitle;
		this.daysBorrowed = daysBorrowed;
	}
	
	
	@Override
	public void run() {
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Days Borrowed : " + daysBorrowed);

		if (daysBorrowed > 7) {
			int fine = (daysBorrowed - 7) * 10;
			System.out.println("Fine : ₹" + fine);
		} else {
			System.out.println("No Fine");
		}

		System.out.println("------------------------");
	}

	public static void main(String[] args) {

		LibraryBook b1 = new LibraryBook("Java Basics", 10);
		LibraryBook b2 = new LibraryBook("Data Structures", 5);
		LibraryBook b3 = new LibraryBook("Spring Boot", 12);

		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		Thread t3 = new Thread(b3);

		t1.start();
		t2.start();
		t3.start();
	}

}
