package com.BufferedReader;
import java.io.*;
public class LongExample {

	public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 2 no");
        long a,b,c;
        a = Long.parseLong(reader.readLine());
        b= Long.parseLong(reader.readLine());
        c=a+b;
        System.out.println(c);
	}

}
