package com.exception;

import java.util.Scanner;

class MinimumAccountBalance extends Exception{
	String msg;
	public MinimumAccountBalance(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
}

public class ExceptionHandling2 {

	static double CurrentBalance=1500;
	
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the amount:");
int amt=scan.nextInt();
try {
	if(CurrentBalance<amt) {
		throw new MinimumAccountBalance("Insufficient fund "+CurrentBalance);
	}
	else {
		System.out.println("You are eligible to withdraw");
	}
	
}catch(MinimumAccountBalance obj) {
	obj.printStackTrace();
}
	}

}
