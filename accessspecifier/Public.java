package com.accessspecifier;
//access from anywhere
import java.util.Scanner;

public class Public {
public int strawberry;
public int blueberry;

public static void method() {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the icecream you want\n press 1 for straberry \n press 2 for blueberry");
	int n=scan.nextInt();
	switch(n) {
	case 1: System.out.println("Strawberry");
	break;
	case 2:System.out.println("Bluebery");
	}
} 
public static void main(String[] args) {
Public p=new Public();
p.method();
	}

}
