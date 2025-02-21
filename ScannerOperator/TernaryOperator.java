package com.ScannerOperator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the 1 no");
      int a,b,c;
      a=scan.nextInt();
      System.out.println("enter the 2 no");
      b=scan.nextInt();
      c=(a>b)?a:b;
      System.out.println(c +"Result for Ternary operator");
	}

}
