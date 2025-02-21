package com.constructor;
//The first statement in a constructor must call to this() or super():
class Cr8 {
	Cr8(int x) {System.out.println(x); }
	public static void main (String []args) {
		new Cr8(11);
		new Sub(12);
	}
}
 
 
class Sub extends Cr8 {
    int y;
 
    Sub(int x) {
        super(x);
        y = x;
        System.out.println(y);
    }
 
    Sub(int x, int y) {
        this(x);
    }
}