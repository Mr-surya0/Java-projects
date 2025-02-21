package com.Scanner;

import java.util.Scanner;

public class ShortExample {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("enter 2 no");
      short a,b,c;
       a= scan.nextShort();
        b= scan.nextShort();
        c =(short)(a+b);
       System.out.println(c);
       }

}
