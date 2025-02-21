package com.Test2;

import java.util.Scanner;
//centigrade to fahrenheit
public class T2 {

	public static void main(String[] args) {
		int f,c;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the centigrade");
		c= scan.nextInt();
		f=c * 9/5 + 32;
		System.out.println("  centigrade to fahrenheit is: "+f);
	}

}
