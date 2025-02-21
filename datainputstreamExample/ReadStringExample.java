package com.datainputstreamExample;
import java.io.*;
public class ReadStringExample {

	public static void main(String[] args)throws IOException {
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("enter your name");
      String a = dis.readLine();
      System.out.println("your name is: "+a);
	}

}
