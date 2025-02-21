package com.CollectionsProject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
   
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SetFancyStore {

    private Set<Product> products;

    public SetFancyStore() {
        products = new HashSet<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        SetFancyStore store = new SetFancyStore(); 
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter product id:");
            int id = scan.nextInt();
            System.out.println("Enter the product name:");
            String name = scan.next();
            System.out.println("Enter the price:");
            double price = scan.nextDouble();

            store.addProduct(new Product(id, name, price));

            System.out.println("Enter 1 to continue or 2 to exit:");
            int choice = scan.nextInt();
            if (choice == 2) {
                break;
            }
        }
        System.out.println("Products in the store:");
        store.displayProducts();
    }
}
