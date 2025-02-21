package com.ProjectTextile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Textile {

	public static void main(String[] args) {
		int tshirt = 50;
		int price = 200;
		int tax = 19;
		int total = 0;
		int balance = 0;

		String name;
		int MobileNo;
		String address;
		String path = "S:/hello.txt";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name:");
		name = scan.next();
		System.out.println("Enter your MobileNo:");
		MobileNo = scan.nextInt();
		System.out.println("Enter your Address:");
		address = scan.next();
		int plus;
		int p;
		int shirt;
		while (true) {
			try {

				FileWriter obj = new FileWriter(path, true);
				BufferedWriter obj1 = new BufferedWriter(obj);
				obj1.newLine();
				String write = name + "\t" + MobileNo + "\t" + address;
				obj1.write(write);
				obj1.close();
				obj.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("How many tshirt you want:");
			shirt = scan.nextInt();
			plus = tax * shirt;
			p = price * shirt;
			total = price * shirt + plus;
			balance = tshirt - shirt;
			System.out.println("enter 1 to continue 2 to exit");
			int enter = scan.nextInt();

			if (enter == 2) {
				break;
			}
			

		}
		System.out.println("Total tshirt: " + tshirt + "\nRemaining tshirt in shop: " + balance + "\nPrice: " + p
				+ "\nTax: " + plus + "\nTotal: " + total);
		System.out.println("\nCustomer Details:");
		System.out.println("Name:"+name+"\nMobileNo:"+MobileNo+"\nAddress:" + address);
	}

}
