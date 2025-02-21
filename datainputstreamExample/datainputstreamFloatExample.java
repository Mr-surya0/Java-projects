package com.datainputstreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class datainputstreamFloatExample {

	public static void main(String[] args) throws  IOException {
        DataInputStream dis = new DataInputStream(System.in); 
	     System.out.println("Enter 2 No; ");
	     float a,b,c;
	     a=Float.parseFloat(dis.readLine());
	     b=Float.parseFloat(dis.readLine());
	     c=a+b;
	     System.out.println("Addtion of 2 No: "+c);
	}

}
