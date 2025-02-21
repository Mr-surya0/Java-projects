package com.datainputstreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class datainputstreamCharExample {

	public static void main(String[] args)throws IOException {
           DataInputStream dis=new DataInputStream(System.in);
           System.out.println("Enter single character: ");
           char ch =(char)dis.read();
           System.out.println(ch);
	}

}
