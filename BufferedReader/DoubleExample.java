package com.BufferedReader;

import java.io.*;

public class DoubleExample {

	public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 2 No");
        double a,b,c;
        a = Double.parseDouble(reader.readLine());
        b= Double.parseDouble(reader.readLine());
        c= a+b;
        System.out.println(c);
	}

}
