package com.method;

public class AllDataTypeMethod {
	public static void main(String[] args) {
		
     short z=Short();
     System.out.println("passing the short value using method "+z);
     int y=Integer();
     System.out.println("passing the Integer value using method "+y);
     float x=Float();
     System.out.println("passing the Float value using method "+x);
     double w=Double(21,23.6);
	 System.out.println("passing the Double value using method "+w);
	 char v=Character();
	System.out.println("passing the Character value using method "+v);
	String u=string();
	System.out.println("passing the String value using method: "+u);
	boolean t=Bool(true);
	System.out.println("passing the Boolean value using method: "+t);
	}
public static short Short() {
	short a,b,c;
	a=2;
	b=5;
	c=(short)(a+b);
	return c;
}
public static int Integer() {
	int a,b,c;
	a=2;
	b=3;
	c=a+b;
	return c;
		
}
public static float Float() {
	float a,b,c;
	a=1.4f;
	b=1.5f;
	c=a+b;
	return c;
}
public static double Double(double a,double b) {
	double 	c=a+b;
	return c;
}
public static char Character( ) {
	char a='s';
	return a;
}
static   String  string() {
	String a="surya";
	return a;
}
static boolean Bool(boolean a) {
	return a;
}
}
