package com.Test2;

import java.util.Scanner;

public class T3 {
//area of triangle
	public static void main(String[] args) {
         double a,b,c,p,s,area;
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the three sides of triangle");
         a= scan.nextDouble();
         b= scan.nextDouble();
         c=scan.nextDouble();
         
         p=a+b+c;
         s=p/2;
         
         area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("area of triangle is: "+area);

	}

}
