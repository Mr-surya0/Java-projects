package com.ReferenceVariable;
abstract class x
{
	x()
	{
		System.out.println("hii mame");
	}
	abstract public void  method ();
	public void add() 
	{
		int a,b,c;
		a=10;
		b=12;
		c=a+b;
		System.out.println(c);
	}
}

class y extends x
{
      void sub() {
    	  int a,b,c;
    	  c=10-1;
    	  
    	  System.out.println(c);
      }
      public void  method () {
    	  System.out.println("completed");
      }
}
public class referenceVariable {

	public static void main(String[] args) {
x ref;
y obj = new y();
ref =obj;
ref.method();
ref.add();
	}

}
