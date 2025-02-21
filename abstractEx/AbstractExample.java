package com.abstractEx;
class example{
	void square(double x) {
		System.out.println("square value of x "+x*x);
	}
	void cube(int x) {
		System.out.println("cube value of x "+x*x*x);
	}
	void square (int x) {
		for (int i=0;i<x;i++) {
			if( i*i==x) {
				System.out.println(i);
			}
		}
	}
}
public class AbstractExample {

	public static void main(String[] args) {
           example obj=new example();
           obj.square(4);
           example ob=new example();
           ob.cube(2);
           example object=new example();
           object.square(100);
	}

}
