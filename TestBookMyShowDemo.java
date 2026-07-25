package com.multithreading;

class BookMyShow {

	int total_available_Tickets = 10;

	synchronized void bookMyTicket(String name, int tickets) {

		if (total_available_Tickets >= tickets) {
			System.out.println(tickets + " Tickets has booked Successfully for mr." + name);

			total_available_Tickets = total_available_Tickets - tickets;
			System.out.println("Remaining Tickets count is : " + total_available_Tickets);
		} else {
			System.err.println("Sorry !! All Tickets has been sold out !! " + name);
			System.err.println("Remaining Tickets count is : " + total_available_Tickets);
		}
	}

}

class Customers extends Thread {

	BookMyShow bms;
	String customerName;
	int tickets;

	public Customers(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);

	}
}

public class TestBookMyShowDemo {

	public static void main(String[] args) {
		
		BookMyShow bms = new BookMyShow();
		
		Customers c1 = new Customers(bms, "Nivas", 6);
		c1.start();

		Customers c2 = new Customers(bms, "Sriram", 3);
		c2.start();

		Customers c3 = new Customers(bms, "Akash", 3);
		c3.start();
	}

}
