package com.oops;

import java.util.*;

class customer{
	
	int deposit(int amt) {
		int initialbalance = 4000;
		int Total=initialbalance+amt;
		return Total;
		
	}
}
public class MessagePassing {

	public static void main(String[] args) {
     customer obj = new customer();
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the deposit amount");
     
     int amount = scan.nextInt();
     
     int yourbalance= obj.deposit(amount);
     System.out.println("your balance is "+yourbalance);
     scan.close();
		
	}

}
