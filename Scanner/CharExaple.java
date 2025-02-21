package com.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class CharExaple {

	public static void main(String[] args)throws IOException {
	       Scanner scan = new Scanner (System.in);
	       System.out.println("enter single char");
	      char a;
	       a= scan.next().charAt(0);
	        
	       System.out.println(a);
	       }

	
}