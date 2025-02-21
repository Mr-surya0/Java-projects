package com.CMS;

import java.util.Scanner;

public class CMS {

	public static void main(String[] args) {
		ContactManager cm = new ContactManager(10);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\ncontrol management system");
			System.out.println("1,Add contact");
			System.out.println("2,View contact");
			System.out.println("3,Update contact");
			System.out.println("4,Search contact");
			System.out.println("5,delete contact");
			System.out.println("6,Exit");

			System.out.println("Enter your choice");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter your name");
				String name = scan.next();
				System.out.println("Enter you phoneNumber");
				String addPhoneNumber = scan.next();
				cm.addContact(name, addPhoneNumber);
				break;
			case 2:
				cm.viewContact();
				break;
			case 3:
				System.out.println("Enter your name to update");
				String updateName = scan.next();
				System.out.println("Enter new phone number");
				String newPhoneNumber = scan.next();
				cm.updateContact(updateName, newPhoneNumber);
				break;
			case 4:
				System.out.println("Enter your name to search");
				String SearchName = scan.next();
				cm.searchContact(SearchName);
				break;

			case 5:
				System.out.println("Enter your name to delete");
				String deleteName = scan.next();
				cm.DeleteContact(deleteName);
				break;
			case 6:
				System.out.println("Thaks you for coming");
				System.exit(0);
			default:
				System.out.println("Invalid choice,please enter the correct choice");
			}
		}

	}

}
