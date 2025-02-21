package com.Interface;

import java.util.Scanner;

interface measure{
	void read ();
	void area ();
}
class square implements measure{
	int a=0;
	square() 
	{
		
		System.out.println("Lets start the program");
	}

	public void read() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the area value");
		 a = scan.nextInt();
	}

	public void area() {
		System.out.println(a*a);
	}
}
class rect implements measure{
	int l=0,b=0;
	
	rect(){
		System.out.println("Lets start 2nd program");
	}
	public void read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
	l=scan.nextInt();
	System.out.println("Enter the breath");
	b=scan.nextInt();
	scan.close();
	}
	public void area() {
		System.out.println("Area is "+(0.5*l*b));
	}	
}

public class SingleInterface {

	public static void main(String[] args) {
		// Single interface implemented into multiple interface
  square obj=new square();
  
  obj.read();
  obj.area();
  
  rect obj1 = new rect();
  
  obj1.read();
  obj1.area();
	}

}
