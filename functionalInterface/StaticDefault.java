package com.functionalInterface;
@FunctionalInterface
interface e{
	void add(int a);
	default void div(int a,int b) {
		System.out.println(a+b);
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
}
class sub implements e{
	public void add(int a) {
		System.out.println(a/a);
	}
}
public class StaticDefault {

	public static void main(String[] args) {
     e obj=new sub();
     obj.div(10, 20);
     e.mul(10, 10);
     
     //lambda expression
     e ref=(int i)->System.out.println(i-100);
     ref.add(10);
	}

}
