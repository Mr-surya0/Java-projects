package com.oops;
class superclass{
	void method(int a,int b) {
		System.out.println(a+b);
	}
}
class subclass extends superclass{
	void method(int x, int y) {
		System.out.println(x*y);
	}
}
public class polymorphismOverriding {

	public static void main(String[] args) {
         superclass obj = new superclass();
         subclass obj1 = new subclass();
         obj.method(2,2);
         obj1.method(2,10);
      
	}

}
