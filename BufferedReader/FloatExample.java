package com.BufferedReader;
import java.io.*;
public class FloatExample {

	public static void main(String[] args)throws IOException {
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	        System.out.println("enter 2 no");
	        float a,b,c;
	        a= Float.parseFloat(reader.readLine());
	        b= Float.parseFloat(reader.readLine());
	        c= a+b;
	        System.out.println(c);
	}

}
