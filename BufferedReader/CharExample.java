package com.BufferedReader;
import java.io.*;
public class CharExample {

	public static void main(String[] args) throws IOException {
             BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
           System.out.println("enter your initial");
             char a;
             a = (char)(reader.read());
             System.out.println(a);
	}

}
