package com.functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface d{
	int how(String name);
}
public class UsingDatatype {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any letter it display the length");
		String s=scan.next();
		d ref=(String n)-> {return n.length();};
		int len=ref.how(s);
  System.out.println(+len);
	}

}
