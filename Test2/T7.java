package com.Test2;
// mutiple of 5
import java.util.Scanner;
public class T7 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	System.out.println("enter any no");
	a=scan.nextInt();
	if (a%5==0) {
		System.out.println("it is multiplied by 5 ");
	}
	else {
		System.out.println("Not multiplied by 5");
	}
}
}
