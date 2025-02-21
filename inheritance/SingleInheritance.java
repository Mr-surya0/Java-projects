package com.inheritance;

import java.util.Scanner;

class a {
	void method() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 No:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c=a+b;
	System.out.println("Addition of 2 No "+c);
}
}
class b extends a{
	
}

public class SingleInheritance {

	public static void main(String[] args) {
b obj=new b();
obj.method();	}

}
