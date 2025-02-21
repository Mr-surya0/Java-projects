package com.BufferedReader;
import java.io.*;
public class BooleanExample {

	public static void main(String[] args)throws IOException {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter true or false \nyou have a good bike");
       boolean a=Boolean.parseBoolean(reader.readLine());
       System.out.println(a);
	}

}
