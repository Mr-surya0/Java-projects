package com.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args)throws IOException {
	       Scanner scan = new Scanner (System.in);
	       System.out.println("true or false");
	      boolean a;
	       a= scan.hasNextBoolean();
	        
	       System.out.println(a);
	       }

	
}
