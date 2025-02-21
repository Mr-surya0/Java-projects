package com.exception;

public class ExceptionHandlingPredefinedMethod {

	public static void main(String[] args) {
try {
	int a=10/0;
}catch(Exception e) {
	//e.printStackTrace();
	//System.out.println(e.toString());
	//System.out.println(e.getMessage());
	System.out.println("this no is not divided by zero");
}
	}

}
