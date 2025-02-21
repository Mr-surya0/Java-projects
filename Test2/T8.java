package com.Test2;

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a,b;
System.out.println("enter 2 No");
a=scan.nextInt();
b=scan.nextInt();
if (a%5==0 && b%7==0) {
	System.out.println("it is multiple by 5 and 7");
}
else 
{
	System.out.println("it is not mutiple by 5 or 7");}
	}

}
