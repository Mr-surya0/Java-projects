package com.oops;

//overloading example
class addition{
	void method(int a,int b) {
		System.out.println( a+b+ " This is the addition of 2 No ");
	}
	void method(float x, float y) {
		float c;
		c=x+y;
		System.out.println("addition of float value "+c);
	}
	void method(int c,float d) {
		System.out.println("addition of int + float value "+ c+d);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		addition obj = new addition();
		obj.method(12,3);
		obj.method(12.1f,3.1f);
		obj.method(12.1f,2);
		
		

	}

}
