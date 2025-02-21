package com.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteExample {
 public static void main (String args[])throws IOException {
	   
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
	 System.out.println("enter 2 no");
	 byte a,b,c;
	 a = Byte.parseByte(reader.readLine());
	 b= Byte.parseByte(reader.readLine());
	 c=(byte)(a+b);
	 System.out.println(c);
	 }
}
