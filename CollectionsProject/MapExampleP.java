package com.CollectionsProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MapExampleP {
	

	    public static void main(String[] args) {
	        Map<String, Double> items = new HashMap<>();
	        items.put("Cake", 20.0);
	        items.put("Bread", 5.0);
	        items.put("Cookies", 10.0);

	        System.out.println("Available Items:");
	        for (String item : items.keySet()) {
	            System.out.println(item + ": €" + items.get(item));
	        }

	        Scanner scanner = new Scanner(System.in);
	        double totalBill = 0.0;
            
	        while (true) {
	            
	            System.out.println("Enter the item name:");
	            String itemName = scanner.next();
	            System.out.println("Enter the quantity:");
	            int quantity=scanner.nextInt();
	            System.out.println("Buy items is complete ('yes' or no):");
	            String y=scanner.next();
	            if (y.equalsIgnoreCase("yes")) {
	                break;
	            }

	            if (items.containsKey(itemName)) {
	                totalBill += items.get(itemName)*quantity;
	                System.out.println(itemName + " added to the bill.");
	            } else {
	                System.out.println("Item is not available order other item");
	            }
	        }

	        System.out.println("Total bill amount: €" + totalBill);
	    }
	}
