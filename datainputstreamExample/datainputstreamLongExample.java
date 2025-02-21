package com.datainputstreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class datainputstreamLongExample {

	public static void main(String[] args) throws  IOException {
        DataInputStream dis = new DataInputStream(System.in); 
	     System.out.println("Enter 2 No; ");
	     long a,b,c;
	     a=Long.parseLong(dis.readLine());
	     b=Long.parseLong(dis.readLine());
	     c=a+b;
	     System.out.println("Addtion of 2 No: "+c);
	}

}
