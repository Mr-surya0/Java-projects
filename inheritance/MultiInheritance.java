package com.inheritance;
class n{
	void m1(){
	int a=2,b=3;
	System.out.println("Addition of 2 No "+a+b);
	
	}
}
class r extends n{
	void m2() {
		int c=5-4;
		System.out.println("subraction of 2 No "+c);
	}
}
class c extends r{
	void m3() {
		int d=10*5;
		System.out.println("Multiplication of 2 No "+d);
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
       c obj = new c();
       obj.m1();
       obj.m2();
       obj.m3();
	}

}
