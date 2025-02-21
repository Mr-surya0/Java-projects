package com.CollectionsProject;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
public class ListChatItem {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Samosa", 10));
        items.add(new Item("Panipuri", 20));
        items.add(new Item("ChennaMasala", 25));

        Scanner scanner = new Scanner(System.in);

        int totalAmount = 0;

        while (true) {
            System.out.println("Available Items:");
            for (Item item : items) {
                System.out.println(item.getName() + ": ₹" + item.getPrice());
            }

            System.out.println("Enter the item you want:");
            String itemName = scanner.next();

            Item selectedItem = null;
            for (Item item : items) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    selectedItem = item;
                    break;
                }
            }

            if (selectedItem == null) {
                System.out.println("Item not available.");
                continue;
            }

            System.out.println("Enter the quantity:");
            int quantity = scanner.nextInt();

            totalAmount += selectedItem.getPrice() * quantity;

            System.out.println("Total amount so far: ₹" + totalAmount);

            System.out.println("Do you want to continue? (yes/no)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Total amount: ₹" + totalAmount);
    }
}
