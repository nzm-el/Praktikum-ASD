package jb_15;

import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

    Customer customer1 = new Customer(1, "Zakia");
    Customer customer2 = new Customer(5, "Budi");

    customers.add(customer1);
    customers.add(customer2);

    //Menambahkan Elemen Melebihi Kapasitas Awal
    customers.add(new Customer(4, "Cica"));

    ////Menambahkan Elemen pada Indeks Tertentu 
    customers.add(2, new Customer(100, "Rosa"));

    //Menggunakan indexOf()
    System.out.println(customers.indexOf(customer2));

    //Menggunakan get()
    Customer customer = customers.get(1);
    System.out.println(customer.name);
    customer.name = "Budi Utomo";

    for (Customer cust : customers) {
        System.out.println(cust.toString());
    }

    System.out.println(customers);

    //Menggunakan addAll()
    ArrayList<Customer> newCustomers = new ArrayList<>();
    newCustomers.add(new Customer(201, "Della"));
    newCustomers.add(new Customer(202, "Victor"));
    newCustomers.add(new Customer(203, "Sarah"));

    customers.addAll(newCustomers);

    for (Customer cust : customers) {
        System.out.println(cust.toString());
    }

    System.out.println(customers);
    }
}