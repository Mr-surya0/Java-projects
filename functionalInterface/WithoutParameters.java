package com.functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface c{
public abstract void welcome();
}
public class WithoutParameters {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any message");
		String a =scan.next();
		c ref=()->System.out.println(a);
		ref.welcome();
	}

}
