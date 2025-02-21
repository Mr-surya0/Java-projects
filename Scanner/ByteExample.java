package com.Scanner;

import java.util.Scanner;

public class ByteExample {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("enter 2 no");
       byte a,b,c;
       a= scan.nextByte();
        b= scan.nextByte();
        c =(byte)(a+b);
       System.out.println(c);
       }

}
