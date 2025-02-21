package com.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class FloatExample {

	public static void main(String[] args)throws IOException {
	       Scanner scan = new Scanner (System.in);
	       System.out.println("enter 2 no");
	      float a,b,c;
	       a= scan.nextFloat();
	        b= scan.nextFloat();
	        c =(float)a+b;
	       System.out.println(c);
	       }

	
}
