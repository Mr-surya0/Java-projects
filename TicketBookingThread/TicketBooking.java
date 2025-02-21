package com.TicketBookingThread;

import java.util.Scanner;


class booking extends Thread {
	static int tickets = 10;
	static int cost=200;
	static int price=0;
	public void run() {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to the Confirm Ticket!");
	        System.out.println("Ticket cost is: "+cost);
	        System.out.println("Available Tickets: " + tickets);

	        while (true) {
	            System.out.print("Enter the number of tickets you want to book (0 to exit): \n");
	            int numTickets = scanner.nextInt();
	            if (numTickets == 0) {
	                System.out.println("Thank you for using the Ticket Booking System. Goodbye!");
	                break;
	            }
	            bookTickets(numTickets);
	        }

	        scanner.close();
	    }

	    static void bookTickets(int numTickets) {
	        if (numTickets <= tickets) {
	        	 price=cost*numTickets;
	            System.out.println("Booking " + numTickets + " tickets...");
	            tickets -= numTickets;
	            System.out.println("Tickets booked successfully!\n");
	            System.out.println("Total ticket cost: "+price);
	            System.out.println("Available Tickets: " + tickets);
	        } else {
	            System.out.println("Sorry, only " + tickets + " tickets are available.");
	        }
	}
}

public class TicketBooking {

	public static void main(String[] args) {
		booking obj = new booking();
		obj.start();
	}

}
