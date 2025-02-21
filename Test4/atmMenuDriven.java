package com.Test4;

import java.util.Scanner;

public class atmMenuDriven {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ATM:");
			System.out.println("Enter 1 to Deposit");
			System.out.println("Enter 2 to withdrawl");
			System.out.println("Enter 3 to Check balance");
			System.out.println("Enter 4 to Exit");
int option=scan.nextInt();
switch(option) {
case 1:
	deposit();
	break;
case 2:
	withdrawl();
	break;
case 3:
	CheckBalance();
	break;
case 4:
	Exit();
	break;
default :
	System.out.println("invalid choice");
	break;
               }
			
		             }
	}
	
	static void withdrawl() {
		System.out.println("Enter the amount");
		Scanner scan = new Scanner(System.in);
		int balance=10000;

int withdrawl =scan.nextInt();
if (withdrawl<=balance) {
	System.out.println("withdrawl sucessfully");
}
else {
	System.out.println("insufficient balance");
}
		
	}
	static void deposit() {
		System.out.println("Enter the amount");
		Scanner scan = new Scanner(System.in);
		int deposit;

 deposit =scan.nextInt();
System.out.println("deposit sucessful "+deposit);
	}
	static void CheckBalance() {
		int balance=10000;

		System.out.println("Your balance is: "+balance);
	}
	static void Exit() {
		System.out.println("Thanks for coming to visit");
		System.exit(0);
	}

}
