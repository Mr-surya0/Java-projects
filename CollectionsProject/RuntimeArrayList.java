package com.CollectionsProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class hotel{
	int id;
	String order;
	int price;
	public hotel(int id, String order, int price) {
		super();
		this.id = id;
		this.order = order;
		this.price = price;
	}
	@Override
	public String toString() {
		return "hotel [id=" + id + ", order=" + order + ", price=" + price + "]";
	}
}
public class RuntimeArrayList {
    List<hotel> ar=new ArrayList<>();
   
    public void addOrder(hotel hotels) {
    	ar.add(hotels);
    }
    public void display() {
    	for(hotel hotels : ar) {
    		System.out.println(hotels);
    	}
    }
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 RuntimeArrayList ral=new RuntimeArrayList();
		while(true) {
			
			System.out.println("To add in menu list to display");
			System.out.println("Enter the order id ");
			int id=scan.nextInt();
			System.out.println("Enter the order name");
			String order=scan.next();
			System.out.println("Enter the price");
			int price=scan.nextInt();
			
			ral.addOrder(new hotel(id,order,price));
			
			 System.out.println("Enter 1 to continue or 2 to exit:");
	            int choice = scan.nextInt();
	            if (choice == 2) {
	                break;
	            }
		}
		System.out.println("Menu list:");
	    ral.display();
	}

}
