package com.exception;

public class ExceptionHandlkng1 {

	public static void main(String[] args) {
int a=10;
int b=0;
try {
	int c=a/b;
	System.out.println(c);
}
catch(Exception e){
	System.out.println(e);
	System.out.println("It is not divided by zero");
}
	}

}
