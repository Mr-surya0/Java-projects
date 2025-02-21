package com.exception;

class ExceptionHand extends Exception{
	
}
class Triangle{
	int h,b;
	Triangle(int l,int m){
		h=l;
		b=m;
	}


public void area()throws ExceptionHand{
	if ((b<=0 || h<=0))throw new ExceptionHand();
	else {
		System.out.println("Area is :\t"+0.5*b*h);
	}
 }

}
public class ExceptionHandlingwithEmptyClass {

	public static void main(String[] args) {
       Triangle obj=new Triangle(1,40);
		try {
			obj.area();
		}catch(ExceptionHand e) {
			System.out.println(e);
		}
	}

}
