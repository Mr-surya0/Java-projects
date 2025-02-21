package com.operators30;

import java.util.Scanner;

public class o3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
boolean leap=year % 4 == 0 ;
        if (leap) {
            System.out.println(year + " is a leap year.");
        } 
        else {
           
        	System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    
}