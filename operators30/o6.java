package com.operators30;

import java.util.Scanner;

public class o6 {

	public static void main(String[] args) {
		// Create a program to find the GCD (Greatest Common Divisor) of two numbers.
		{
			int n1 , n2 ;
			Scanner scan = new Scanner (System.in);
			System.out.println("enter 2 no: ");
			n1=scan.nextInt();
			n2=scan.nextInt();
			
			while (n1 != n2) {
				if (n1 > n2)
					n1 = n1 - n2;
				else
					n2 = n2 - n1;
			}
			System.out.printf("GCD of n1 and n2 is: " + n2);
		}
	}
}
