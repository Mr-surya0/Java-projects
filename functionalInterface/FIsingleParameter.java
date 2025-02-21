package com.functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface b{
	public abstract void area(int x);
}
public class FIsingleParameter {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter any No:");
	int a=scan.nextInt();
     b ref=(int y)->System.out.println(y*y);
     ref.area(a);
     
     b ref1=(y)->System.out.println(y+y);
     ref1.area(a);
     
     
     b ref2=y->System.out.println(y/y);
     ref2.area(a);
	}

}
