package com.functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface a{
	void add(int a,int b);
}
public class TwoParameters {
        
	public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
		    int a,b;
		    System.out.println("Enter first No");
		    a=scan.nextInt();
		    System.out.println("Enter second No");
		    b=scan.nextInt();
     a obj=(int d,int c)->System.out.println("Addition of 2 No:"+(a+b));
     obj.add(a, b);
	}
}
