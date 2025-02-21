package com.datainputstreamExample;

import java.io.DataInputStream;
import java.io.IOException;;

public class datainputstreamShortExample {

	public static void main(String[] args) throws  IOException {
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("Enter 2 No: ");
      short a,b,c;
      a= Short.parseShort(dis.readLine());
      b= Short.parseShort(dis.readLine());
      c=(byte)(a+b);
      System.out.println("Addition of 2 No: "+c );
	}

}
