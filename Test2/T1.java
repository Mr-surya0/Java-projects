package com.Test2;
import java.util.Scanner;
public class T1 {
//find odd or even
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int a;
     System.out.println("enter any number it will check the number is odd or even ");
a= scan.nextInt();
if (a%2==0) {
	System.out.println("the given number is even");
}
else {System.out.println("the given number is odd");}
	}

}
