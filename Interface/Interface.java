package com.Interface;
interface a{
	int x=10;
	void add();
}
interface c{
	int b=15;
	void x();
}
class b implements a{
	public void add() {
		int a,b,c;
		a=34;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void x() {
		int b=10*10;
		System.out.println((b));
		
	}
}

public class Interface {

	public static void main(String[] args) {
		b obj=new b();
		obj.add();
		obj.x();
	}

}
