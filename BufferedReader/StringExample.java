package com.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExample {

			public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
          System.out.println("enter your name");
            String a;
            a = (String)(reader.readLine());
            System.out.println(a);
	}

}

	