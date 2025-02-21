package com.abstract1;
abstract class a{
	abstract void method(double x) ;
	abstract void method(float y) ;
	abstract void method(int z) ;
	abstract void method(String s);
}
class b extends a{
	void method (double x) {
		System.out.println(x*x);
	}
	void method(float y) {
		System.out.println(y+y);
	}
	void method(int z) {
		System.out.println(z-z);
	}
	void method (String s) {
		System.out.println(s);
	}
}
public class Abstract {

	public static void main(String[] args) {
b obj=new b();
obj.method(10.1);
obj.method(10.0);
obj.method(10);
obj.method("murugan");
	}

}
