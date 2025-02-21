package com.Test2;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
int a, r;
Scanner scan = new Scanner(System.in);
System.out.println("enter the radius");
r=scan.nextInt();
a=2*22/7*r;
System.out.println("circumfrence "+a );
int area= 22/7*r*r; 
	System.out.println("area of circle is "+area);
	}
}
