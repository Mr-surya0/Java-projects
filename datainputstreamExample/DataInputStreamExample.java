package com.datainputstreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) throws  IOException {
		DataInputStream dis = new DataInputStream(System.in); 
		System.out.println("Enter 2 No:");
		byte a,b,c;
		a= Byte.parseByte(dis.readLine());
		b= Byte.parseByte(dis.readLine());
        c=(byte)(a+b);
        System.out.println("Addition of 2 No "+c);
	}
}
