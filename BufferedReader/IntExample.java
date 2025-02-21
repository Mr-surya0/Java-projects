package com.BufferedReader;
import java.io.*;

public class IntExample {
    public static void main(String[] args)throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("enter 2 no");
    	int a,b,c;
    	a=Integer.parseInt(reader.readLine());
    	b=Integer.parseInt(reader.readLine());
    	c=a+b;
    	System.out.println();
    	
    }
}
