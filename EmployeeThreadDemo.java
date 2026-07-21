package com.multithreading;

class EmployeeName implements Runnable {

    @Override
    public void run() {
        System.out.println("Employee Name : Nivas");
        System.out.println(Thread.currentThread());
    }
}

class EmployeeId implements Runnable {

    @Override
    public void run() {
        System.out.println("Employee ID : JFS-B70-004");
        System.out.println(Thread.currentThread());
    }
}

class EmployeeSalary implements Runnable {

    @Override
    public void run() {
        System.out.println("Employee Salary : 6 LPA");
        System.out.println(Thread.currentThread());
    }
}

public class EmployeeThreadDemo {

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        EmployeeName en = new EmployeeName();
        Thread t1 = new Thread(en);

        EmployeeId ei = new EmployeeId();
        Thread t2 = new Thread(ei);

        EmployeeSalary es = new EmployeeSalary();
        Thread t3 = new Thread(es);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Method Ended");
    }
}