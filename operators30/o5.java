package com.operators30;

import java.util.Scanner;


public class o5 {

	public static void main(String[] args) {
		// the largest among three numbers without using conditional statements
       Scanner scan = new Scanner(System.in);
       int a,b,c;
       System.out.println("enter 3 no: ");
       a=scan.nextInt();
       b=scan.nextInt();
       c=scan.nextInt();
       
       int max=Math.max(Math.max(a, b),c);
       System.out.println(max);
	}

}
