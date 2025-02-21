package com.ScannerOperator;
import java.util.Scanner;
public class castOperator {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         float a ;
         System.out.println("Enter a float value: ");
         a = scan.nextFloat();
         int b = (int)a;
         System.out.println("output: "+b);
	}

}
