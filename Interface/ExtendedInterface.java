package com.Interface;

import java.util.Scanner;

interface input{
	void read();
}
interface calculate extends input{
	void area();
}
class triangle implements calculate{
	int b=0,h=0;
	public void read() {
		Scanner scan = new Scanner(System.in);
System.out.println("Enter breath ");
b=scan.nextInt();
System.out.println("Enter height");
h=scan.nextInt();
	}
	public void area() {
		System.out.println("Area is: "+0.5*b*h);
	}
}
public class ExtendedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle obj=new triangle();
		obj.read();
		obj.area();
	}

}
