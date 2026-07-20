package com.multithreading;

class Warehouse {
    private int stock = 20;

    public synchronized void addItems(int quantity) {
        stock += quantity;
        System.out.println("Supplier added " + quantity + " items.");
        System.out.println("Stock after adding: " + stock);
    }

    public synchronized void removeItems(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("Customer purchased " + quantity + " items.");
            System.out.println("Stock after purchase: " + stock);
        } else {
            System.out.println("Insufficient Stock");
        }
    }

    public int getStock() {
        return stock;
    }
}

class Supplier implements Runnable {
    Warehouse warehouse;

    Supplier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.addItems(10);
    }
}

class Customer implements Runnable {
    Warehouse warehouse;

    Customer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.removeItems(5);
    }
}

public class WareHouseDemo {

    public static void main(String[] args) throws InterruptedException {

        Warehouse warehouse = new Warehouse();

        Thread supplier = new Thread(new Supplier(warehouse));
        Thread customer = new Thread(new Customer(warehouse));

        supplier.start();
        customer.start();

        supplier.join();
        customer.join();

        System.out.println("Final Available Stock: " + warehouse.getStock());
    }
}