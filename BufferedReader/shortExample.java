package com.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shortExample {
	 public static void main (String args[])throws IOException {
		   
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
		 System.out.println("enter 2 no");
		 short a,b,c;
		 a = Short.parseShort(reader.readLine());
		 b= Short.parseShort(reader.readLine());
		 c=(short)(a+b);
		 System.out.println(c);
		 }
}
