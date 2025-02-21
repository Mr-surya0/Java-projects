package com.datainputstreamExample;

import java.io.IOException;
import java.io.DataInputStream;

public class datainputstreamIntExample {

	public static void main(String[] args) throws  IOException {
         DataInputStream dis = new DataInputStream(System.in); 
	     System.out.println("Enter 2 No; ");
	     int a,b,c;
	     a=Integer.parseInt(dis.readLine());
	     b=Integer.parseInt(dis.readLine());
	     c=a+b;
	     System.out.println("Addtion of 2 No: "+c);
	}

}
